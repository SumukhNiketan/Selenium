package com.pageFactoryClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage{
	
	private final WebDriver driver;
	
	@FindBy(name = "q")
    private WebElement searchBox;

	@FindBy(name = "btnK")
    private WebElement searchButton;
	
	public SearchPage(WebDriver driver) throws Exception {
        this.driver = driver;
        MyPageFactory.initElements(driver, this);
    }
	
	public void addSearchTextInField(String searchTest)
	{
		this.searchBox.sendKeys(searchTest);
	}
	
	
	public void hitEnter()
	{
		this.searchBox.sendKeys(Keys.ENTER);
	}

}
