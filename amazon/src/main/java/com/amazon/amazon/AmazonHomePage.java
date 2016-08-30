package com.amazon.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonHomePage {

	WebDriver driver;
	String url = "https://www.amazon.com/";

	By searchBox = By.id("twotabsearchtextbox");
	By serchContainer = By.xpath("//div[@id='nav-flyout-searchAjax']//div//div");
//	By selectLightningCAble = By.xpath("//div[@id='refinements']//span[contains(text(),'Lightning Cables')]");
//	By rating = By.xpath("//li[@id='result_6']//span//a//i[1]");

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchItem(String search) throws InterruptedException {
		WebElement element = driver.findElement(searchBox);
		element.sendKeys(search);
		Thread.sleep(4000);
	}

	public void searchTheContainerforIphoneCharger() throws InterruptedException {
		WebElement element = driver.findElement(serchContainer);
		List<WebElement> list = element.findElements(By.tagName("div"));
		for (WebElement ele : list) {
			if (ele.getText().equals("iphone 6s charger")) {
				String e = ele.getText();
				ele.click();
				System.out.println(e);
				break;
			}
		}
		Thread.sleep(3000);
	}

//	public void selectLightningCable() throws InterruptedException {
//		WebElement element = driver.findElement(selectLightningCAble);
//		element.click();
//		Thread.sleep(3000);
//	}

//	public void selectFiveStarRating() throws InterruptedException {
//		Actions action = new Actions(driver);
//		action.moveByOffset(0, 50);
//		Thread.sleep(3000);
//		WebElement element = driver.findElement(rating);
//		action.moveToElement(element).build().perform();
//	}
}