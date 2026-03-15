package com.ramya.api_automation;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetUsersTest {

	@Test
	public void getUsersTest() {

		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		given().when().get("/users").then().statusCode(200).log().ifStatusCodeIsEqualTo(300);
	}
}
