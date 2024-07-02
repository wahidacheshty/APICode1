package com.crudOpration;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValadateJSONbody {
	//baseURI ="https://reqres.in/api/users/2";
	@Test
	
	void valadatJsonbody() { 
		RequestSpecification req =RestAssured.given();
		req.baseUri("https://reqres.in");
		req.basePath("api/users?page=2");
		
		//Create perform response body
		Response res = req.get();
		ResponseBody resBody = res.getBody();
		
		String resString = resBody.asString();
		//System.out.println(resString);
		//Assert.assertEquals(resString.contains("George"), true);
		JsonPath jsp = resBody.jsonPath();
		String firstname = jsp.get("data[0].first_name");
		Assert.assertEquals("firstName", "George");
		
		String avatar = jsp.get("data[1].avatar");
		Assert.assertEquals("avatar", "");
		
		
	}

}
