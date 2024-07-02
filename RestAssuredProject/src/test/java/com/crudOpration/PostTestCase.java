package com.crudOpration;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostTestCase {
	//Create or post the record
	
	@Test
	void post1() {
		JSONObject jb = new JSONObject();
		jb.put("name", "Shan");
		jb.put("job", "Developer");
		RestAssured.baseURI="https://regres.in/api/users";
		RestAssured.given()
		.header("ContainType","application/json")
		.body(jb.toJSONString())
		.when().post()
		.then().statusCode(201).log().all();
		
		
	}
	
	
	
	
	

}
