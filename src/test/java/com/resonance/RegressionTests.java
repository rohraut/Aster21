package com.resonance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.resonance.keywords.UIKeywords;

public class RegressionTests {
	@Test
	public static void verifyTitleOfHomePage() {
		UIKeywords.openBrowser("ChrOME");
		UIKeywords.launchUrl("https://www.testingshastra.com");
		String actualTitle = UIKeywords.getTitle();
		WebElement element = UIKeywords.driver.findElement(By.cssSelector(""));
		UIKeywords.enterText(null, actualTitle);

		Assert.assertEquals(actualTitle, "Home page");

	}

}
