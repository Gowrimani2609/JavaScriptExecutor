package com.sample.jse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		WebElement loginBtn = driver.findElement(By.linkText("Log In"));
		flash(loginBtn, driver);
		drawborder(loginBtn, driver);

	}
	
	public static void flash(WebElement element, WebDriver driver) 
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
	}
	
	public static void drawborder(WebElement element, WebDriver driver) 
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}

}
