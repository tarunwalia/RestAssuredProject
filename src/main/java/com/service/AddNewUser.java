package com.service;

import com.common.SetUpRestTest;
import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;

public class AddNewUser {
	public AddNewUser() {
		RestAssured.baseURI  =SetUpRestTest.WEBMONK_UIR;
	}
	
	public void addNewUser(String UserId, String www){
		given().
		contentType("application/json").
		body("{\n  \"login\" : \""+UserId+"\",\n  \"www\" : \""+www+"\"\n}").
		when().
		post("/addNewUser").
		then().
		body(containsString("id")).
        body(containsString("login")).
        body(containsString("www")).
        statusCode(200);
		
		
	}

}
