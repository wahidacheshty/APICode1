package com.crudOpration;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class QueryParameters {
	
	@Test
	
	void querparm() {
		//get request reference
		RequestSpecification req =RestAssured.given();
		req.baseUri("https://reqres.in");
		req.basePath("api/users");
		
		req.queryParam("page","2").queryParam("id", "10");
		
	QueryableRequestSpecification qrs =SpecificationQuerier.query(req);
		
	//get base uri
	
	String retriveBaseUri =qrs.getBaseUri();
	System.out.println("BAse path"+retriveBaseUri);
	String reburl = qrs.getBasePath();
	//String resBody =qrs.getBody();
	//System.out.println("S");
	System.out.println("String URL;"+reburl);
	//perform get request
	Response res = req.get();
	
	
	
	
	
	}
	
	
	

}
