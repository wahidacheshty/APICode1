package com.crudOpration;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestCaseOne {
	//"https://regres.in/api/users?page=2"
//https://restful-booker.herokuapp.com/booking
	@Test
	void testOne() {
 		
Response res = RestAssured.get("https://restful-booker.herokuapp.com/booking");
System.out.println("Response code "+res.getBody().asString());	
System.out.println("Status code"+res.statusCode());
System.out.println("Header code "+res.getHeader("Contain Type"));
System.out.println("Time code"+res.time());
int responsestatusCode = res.getStatusCode();
Assert.assertEquals(200, responsestatusCode);
	}
	
	@Test
	void testTwo() {
		RestAssured.baseURI="https://regres.in/api/users?page=2 ";
		RestAssured.given()
		.queryParam("page", 2)
		
		.when().get()
		.then().statusCode(200);
		
	}
	
	

}
