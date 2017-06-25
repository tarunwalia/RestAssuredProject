package com.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.AddAndDeleteUserTest;
import com.tests.AddNewUserTest;
import com.tests.GetUserDataTest;

@RunWith(Suite.class)
@SuiteClasses({ GetUserDataTest.class, AddNewUserTest.class, AddAndDeleteUserTest.class })

public class TestSuite {

}
