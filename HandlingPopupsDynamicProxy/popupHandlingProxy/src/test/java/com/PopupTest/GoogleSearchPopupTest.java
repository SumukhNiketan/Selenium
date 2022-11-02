package com.PopupTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pageFactoryClasses.SearchPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPopupTest{
	@Test
	void testPopupOnGoogleSearch()
		{
		try {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		SearchPage search = new SearchPage(driver);
		search.addSearchTextInField("Hello World");
		search.hitEnter();
		Thread.sleep(10000);
		driver.quit();
		}
		catch(Throwable e)
		{
			System.out.println("Exception Caught in GoogleSearchPopupTest");
		}
	}
}
