package com.amazon.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.Assertion;

import junit.framework.Assert;

public class CablesRating {
	WebDriver driver;
	By rating = By.xpath("//li[@id='result_6']//span//a//i[1]");
	
	public CablesRating(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectFiveStarRating() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveByOffset(0, 50);
		Thread.sleep(3000);
		WebElement element = driver.findElement(rating);
		action.moveToElement(element).build().perform();	
	}
	
	public String getSatrsText(){
		WebElement element = driver.findElement(By.xpath("//div[@id='a-popover-content-1']//div//span[@class='a-size-base a-color-secondary']"));
		String rating = element.getText();
		System.out.println(rating);
		return rating;
	}
}
