package com.resonance.keywords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	public static RemoteWebDriver driver = null;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chRoME")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.err.println("Invalid BrowserName: " + browserName);
			
		}

	}

	public static void launchUrl(String urlName) {
		driver.get(urlName);
	}

	public static String getTitle() {
		return driver.getTitle();
	}

	/**
	 * This method can be used to enter provided text in specified
	 * {@code WebElement}
	 * 
	 * @param element
	 * @param textToEnter This method is deprecated and will no longer in
	 *                    use.Instead you can use enterText(String locator)
	 */
	@Deprecated
	public static void enterText(WebElement element, String textToEnter) {
		element.sendKeys(textToEnter);

	}

	

}
