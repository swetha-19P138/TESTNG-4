package com.qa.testscripts;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.qa.pages.EbayPages;

public class EbaySearchProduct extends Testbase {
	@Test
	public void testcase_001() throws IOException {
	EbayPages.searchbox.sendKeys("Watches");
	Select select = new Select(EbayPages.category);
	select.selectByVisibleText("Consumer Electronics");
	EbayPages.searchbtn.click();
	if(Driver.getTitle().contains("Watches")) {
		System.out.println("Result of the product is "+Driver.getTitle());
		System.out.println();
	}
	else {
		System.out.println("Failed");
	}
	List<WebElement> results = EbayPages.result;

	System.out.println("The 10th product is: "+results.get(9).getText());
	System.out.println("-----------------------------------------");
	System.out.println("All products from 1st page");
	System.out.println();
	for (WebElement webElement : results) {
	System.out.println(webElement.getText());
	System.out.println("-----------------------------------------");
	JavascriptExecutor js = (JavascriptExecutor) Driver;
	js.executeScript("window.scrollBy(0,250)", "");
}	
}
}
