package com.common;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;

import com.jayway.restassured.RestAssured;

public class SetUpRestTest {
	public static final String WEBMONK_UIR = "http://localhost:8080";
	
	@Rule public Timeout globalTimeOut = new Timeout(200000);
	@Rule public TestName name = new TestName();
	
	@Before
	public void setUp(){
		System.out.println("## "+name.getMethodName());
	}
	
	@BeforeClass
	public static void setUpCaseFlow(){
		RestAssured.useRelaxedHTTPSValidation();
	}

}
