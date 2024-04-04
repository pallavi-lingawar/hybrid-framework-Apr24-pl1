package com.allianz.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest 
{
	@Test
	public void titleTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		Assert.assertEquals(Actualtitle , "OrangeHRM");
	}
	
	@Test
	public void applicationDescriptionTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String actualVersion = driver.findElement(By.xpath("//p[contains(normalize-space(), 'OS')]")).getText();
		Assert.assertEquals(actualVersion, "OrangeHRM OS 5.6.1");
	}
}
