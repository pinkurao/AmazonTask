package com.amazon.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCable {
	
	WebDriver driver;
	By selectLightningCAble = By.xpath("//div[@id='refinements']//span[contains(text(),'Lightning Cables')]");
	
	public SelectCable(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectLightningCable() throws InterruptedException {
		WebElement element = driver.findElement(selectLightningCAble);
		element.click();
		Thread.sleep(3000);
	}


}
