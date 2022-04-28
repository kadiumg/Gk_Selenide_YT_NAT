package Selenide_Practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Ten_DropDownHandling {

	@Test
	public void DropDownHandlingTest() throws InterruptedException {
		
		Configuration.browser = "firefox";
		Configuration.headless = false;
		
		open("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		$(By.xpath("//select[@class = 'dropdown countries fleft']")).selectOption(4);
//		Thread.sleep(3000);
//		
//		$(By.xpath("//select[@class = 'dropdown countries fleft']")).selectOption("India");
//		Thread.sleep(3000);
//		
//		$(By.xpath("//select[@class = 'dropdown countries fleft']")).selectOptionByValue("France");
//		Thread.sleep(3000);
//
//		$(By.xpath("//select[@class = 'dropdown countries fleft']")).selectOptionContainingText("key");
//		Thread.sleep(3000);

//		Without Select Methods
		ElementsCollection Coll = $$(By.xpath("//select[@class = 'dropdown countries fleft']/option"));
		System.out.println("Total countries are: "+Coll.size());
		for(SelenideElement e : Coll) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Germany")) {
				e.click();
				break;
			}
		}
		Thread.sleep(3000);
		
	}
	
}
