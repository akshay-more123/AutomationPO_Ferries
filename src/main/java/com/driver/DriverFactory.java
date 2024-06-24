package com.driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory implements Driver{
		
	public WebDriver driver;
	private WebDriverWait waitDriver;
	public final static int TIMEOUT = 60;
	public final static int WAIT_TIMEOUT = 10;
	private static final Logger logger = LogManager.getLogger(DriverFactory.class.getName());
	
	public WebDriver getDriverObject(DriverType driverType) {
		
		WebDriverManager.chromedriver().setup();
		this.driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		return this.driver;
				
		}
	
	public WebDriverWait getWaitDriver() {
		return this.waitDriver;
	}

}
	
