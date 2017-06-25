package com.tests;

import org.junit.Test;

import com.common.SetUpRestTest;
import com.service.AddAndDeleteUser;

public class AddAndDeleteUserTest extends SetUpRestTest{
	
	@Test
	public void testAddAndDeleteUser(){
		AddAndDeleteUser addAndDel = new AddAndDeleteUser();
		addAndDel.addAndDelete("tarunwalia3","www.google3.com");
		
		
	}
}
