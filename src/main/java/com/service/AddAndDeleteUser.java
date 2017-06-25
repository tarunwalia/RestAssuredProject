package com.service;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;

public class AddAndDeleteUser {

	public void addAndDelete(String UserId, String www) {
		String id = given().contentType(ContentType.JSON)
				.body("{\n  \"login\" : \"" + UserId + "\",\n  \"www\" : \"" + www + "\"\n}").when().post("/addUser")
				.then().body(containsString("login")).extract().path("id").toString();

		System.out.println("id: " + id);

		Response res = given().pathParam("id", id).contentType(ContentType.JSON).when().delete("/deleteUser/{id}")
				.then().extract().response();
		
		System.out.println(res.path("successMessage.message"));

		System.out.println(res.jsonPath().get("message"));

		System.out.println(res.asString());
	}

}
