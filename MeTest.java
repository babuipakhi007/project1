package com.paxotech.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MeTest {
	
	private static WebDriver driver = null;
	
	public MeTest() {	
	  }
	
	public static void main(String[] args){
		   
		driver = new FirefoxDriver();
			
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		driver.navigate().to("http://demo.broadleafcommerce.org/");
		
		WebElement LoginLink = driver.findElement(By.xpath(".//*[@id='cart_info']/a[1]/span"));
		
		 LoginLink.click();
		
		WebElement emailAddress = driver.findElement(By.name("j_username"));
		emailAddress.sendKeys("ove.amin@aol.com");
		
		WebElement password = driver.findElement(By.name("j_password"));
		password.sendKeys("punkx");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='login']/div/form/div[3]/input"));
		loginButton.click();
		
		driver.close();
		driver.quit();
		
	}

}
