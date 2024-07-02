package com.crudOpration;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteTest {
	
	
	@Test
	void deleteTest() {;
	
		RestAssured.baseURI="https://regres.in/api/users/52";
		RestAssured.given().
		when().
		delete().
		then().
		log().all().
		statusCode(204);
		
	}

}
