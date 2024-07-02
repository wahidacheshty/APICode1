package com.crudOpration;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HeaderValadation {
	
	@Test
	
	void fetchHeader() {
		// get request reference
		RequestSpecification req1 =RestAssured.given();
		req1.baseUri("https://reqres.in");
		req1.basePath("api/users?page=2");
		
		//Create perform responce body
		
		Response resph = req1.get();
		String cont = resph .getHeader("Content-type");
		System.out.println(cont);
		
		Headers headerList = resph.getHeaders();
		int count =0;
		for(Header hp:headerList) {
			//System.out.println("hp.getName()+". " + hp.getValue());
					// count++;
			//Assert.assertEquals( ,);
		}
		
		//System.out.println(count);
		
	}
	
	
	
	
	

}
