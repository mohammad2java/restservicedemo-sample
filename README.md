## springdoc v3
--------------
	
	1) display allowable values
	2) display manadatory field
	3) display request sample json as working request



## Controller 

	only use to metadata [api,swagger..etc] , no try & catch
	  
	  contains 2 statement in each catch block.
	  1) calling service method to get result
	  HelloResonse ret = helloservice.hello(request);
	  2) return statement of controller.
	 return ResponseEntity.status(HttpStatus.OK).body(ret);
	 
	service method will keep try & catch , will handle db transaction, 
	will throw exception for server side validation[catch by Controller advice],
	 payload validation will done by hibernate validator.
	 each integration will use -resttemplate with interceptor [to log request metadata & response meta-data]

    // databse will keep last status of any request [fail/pass/with remark]

 

