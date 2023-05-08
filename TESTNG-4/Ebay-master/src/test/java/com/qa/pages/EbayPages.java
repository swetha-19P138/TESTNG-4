package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EbayPages {
	WebDriver Driver; 
	
	@FindBy(xpath="//input[@type='text']")
	public static WebElement searchbox;
	
	@FindBy(xpath="//select[@id='gh-cat']")
	public static WebElement category;
	
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement searchbtn;
	
	@FindBy(xpath="//ul//div[@class='s-item__title']//span")
	public static List<WebElement> result; 
	
	@FindBy(xpath="//span[@class='s-item__price']")
	public static List<WebElement> resultPrice;
	
	public EbayPages(WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
		
	}
}
