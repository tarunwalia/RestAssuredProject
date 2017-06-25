package com.service;

import com.common.SetUpRestTest;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;

public class GetUserData {

	public GetUserData() {
		RestAssured.baseURI = SetUpRestTest.WEBMONK_UIR;
	}

	public void getUserData(String userId) {
		Response response = 
				given().
					contentType("application/json").
				when().
					get("/user/" + userId).
				then().
					body(containsString("id")).
					body(containsString("login")).
					body(containsString("www")).
					statusCode(200)
				.extract().response();
		System.out.println(response.asString());

	}

}
