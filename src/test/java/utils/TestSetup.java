package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestSetup {
	public WebDriver driver;
	public TestBase testbase;
	public PageObjectManager pageobjectmanager;
	
	public TestSetup() throws IOException{
		testbase=new TestBase();
		pageobjectmanager=new PageObjectManager(testbase.webDriverManager());
	}
	

}
