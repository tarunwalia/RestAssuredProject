package com.tests;

import org.junit.Test;

import com.common.SetUpRestTest;
import com.service.AddNewUser;

public class AddNewUserTest extends SetUpRestTest{
	
	@Test
	public void testAddNewUser(){
		AddNewUser addNewUser = new AddNewUser();
		addNewUser.addNewUser("tarunwalia2","www.google2.com");
	}

}
