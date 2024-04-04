package com.allianz.test;

import org.testng.annotations.Test;

public class LoginUITest 
{
	@Test(invocationCount = 3)
	public void titleTest()
	{
		System.out.println("title Test");
	}
	
	@Test(priority = 1)
	public void applicationDescriptionTest()
	{
		System.out.println("App info");
		System.out.println("");
	}
}
