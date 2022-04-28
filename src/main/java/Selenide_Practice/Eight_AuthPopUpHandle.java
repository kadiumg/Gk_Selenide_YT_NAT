package Selenide_Practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Eight_AuthPopUpHandle {

	@Test
	public void AuthPopUpTest() throws MalformedURLException {
		
		System.setProperty("Selenide.browser", "firefox");
		
		//Option 1
		//open("https://the-internet.herokuapp.com/basic_auth", "", "admin", "admin");
		
		//Option 2
		open(new URL("https://the-internet.herokuapp.com/basic_auth"),
				"", "admin", "admin");
		
		
		String text = $(By.cssSelector("div.example")).getText();
		//System.out.println(text);
		Assert.assertTrue(text.contains("Congratulations"));
	}
}
