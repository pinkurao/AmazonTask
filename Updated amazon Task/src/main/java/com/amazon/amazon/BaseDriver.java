package com.amazon.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDriver {
	public static WebDriver getDriver(String browsweType, String url) {
		WebDriver driver = null;
		if (browsweType != null && browsweType == "Firefox") {
			driver = new FirefoxDriver();
		}

		else if (browsweType != null && browsweType == "chrome") {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}