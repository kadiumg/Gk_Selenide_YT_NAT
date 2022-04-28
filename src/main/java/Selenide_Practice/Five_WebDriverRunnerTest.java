package Selenide_Practice;

import static com.codeborne.selenide.Selenide.open;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

public class Five_WebDriverRunnerTest {

	@Test
	public void WebDriverRunnerTest() {
		
		Configuration.browser = "firefox";
		Configuration.headless = true;
		
		open("https://opensource-demo.orangehrmlive.com/");
		
		
		WebDriverRunner.clearBrowserCache();
		System.out.println(WebDriverRunner.url());
		Assert.assertTrue(WebDriverRunner.url().contains("orangehrm"));
		
		System.out.println(WebDriverRunner.source());
		
		WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		if(WebDriverRunner.isChrome())
			System.out.println("Running on Chrome");
		else if (WebDriverRunner.isFirefox())
			System.out.println("Running on Firefox");
		else if (WebDriverRunner.isEdge())
			System.out.println("Running on Edge");
	
		
		System.out.println("Headless status: "+ WebDriverRunner.isHeadless());
		System.out.println("Current Browser Supports JavaScript: "+ WebDriverRunner.supportsJavascript());
		
		WebDriverRunner.getAndCheckWebDriver();
		WebDriverRunner.closeWebDriver();
				
	}
}
