package com.prac.rk.ws.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.prac.rk.ws.service.HelloWorld")
public class HelloWorldServicePortImpl implements HelloWorld {

	@Override
	public HelloWorldResponseType sayHello(HelloWorldRequestType parameters) {
		// TODO Auto-generated method stub
		// http://stackoverflow.com/questions/1192596/how-do-i-get-eclipse-to-resolve-classes-generated-with-maven-2
		// http://www.hascode.com/2011/08/contract-first-web-services-using-jax-ws-jax-b-maven-and-eclipse/
		HelloWorldResponseType response = new HelloWorldResponseType();
		response.setMessage("Good day " + parameters.getName() + "!");
		return response;

	}

}
