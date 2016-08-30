package com.amazon.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class AmazonTest {
	WebDriver driver;
	AmazonHomePage amazonHome;
	SelectCable selectCable;
	CablesRating cablesRating;
	
  
  @BeforeClass
  public void beforeClass() {
	  String browser = "Firefox";
	  String url = "https://www.amazon.com/";
	  driver = BaseDriver.getDriver(browser, url);
  }

  @Test
  public void searchForLightnigCableRating() throws InterruptedException{
	  amazonHome= new AmazonHomePage(driver);
	  amazonHome.searchItem("iphone 6s");
	  amazonHome.searchTheContainerforIphoneCharger(); 
	  selectCable = new SelectCable(driver);
	  selectCable.selectLightningCable();
	  cablesRating = new CablesRating(driver);
	  cablesRating.selectFiveStarRating();
	  String expected = "4.8 out of 5 stars";
	  String actual = cablesRating.getSatrsText();
	  Assert.assertEquals(expected, actual);
  }
  
  @AfterClass
  public void afterClass() {
//	  driver.close();
  }

}
