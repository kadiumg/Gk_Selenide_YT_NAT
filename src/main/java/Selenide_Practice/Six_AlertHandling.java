package Selenide_Practice;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class Six_AlertHandling {

	@Test
	public void AlertHandlingTest() {
		
		
		open("https://mail.rediff.com/cgi-bin/login.cgi");
		$(By.xpath("//input[@type='submit' and @value='Sign in']")).click();
		
		Alert ale = switchTo().alert();
		
		String aleText = ale.getText();
		System.out.println(aleText);
		
		ale.accept();
		Assert.assertEquals(aleText,"Please enter a valid user name");
		
	}

	@Test
	public void AlertInputTest() throws InterruptedException {

		open("https://the-internet.herokuapp.com/javascript_alerts");
		$(By.xpath("//li/button[text()='Click for JS Prompt']")).click();

		Alert ale = switchTo().alert();
		ale.sendKeys("Shiva");
		Thread.sleep(5000);
		ale.accept();
		String result = $(By.xpath("//h4//following-sibling::p")).getText();
		System.out.println(result);
		Assert.assertTrue(result.contains("Shiva"));
			
		}
	
}
