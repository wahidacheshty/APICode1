package com.crudOpration;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PatchTests {
	
	@Test
	
	void update() {
		JSONObject jb = new JSONObject();
		jb.put("name", "Khan");
		jb.put("job", "Tester");
		RestAssured.baseURI="https://regres.in/api/users/427";
		RestAssured.given()
		.header("ContainType","application/json")
		.body(jb.toJSONString())
		.when().patch()
		.then().statusCode(200).log().all();
		
		
		
		
	}
	
	
	

}
