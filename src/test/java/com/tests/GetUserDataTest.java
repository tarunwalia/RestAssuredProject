package com.tests;

import org.junit.Test;

import com.common.SetUpRestTest;
import com.service.GetUserData;

public class GetUserDataTest extends SetUpRestTest{
	
	@Test
	public void testUserData(){
		GetUserData userData = new GetUserData();
		userData.getUserData("1");	
		
	}

}
