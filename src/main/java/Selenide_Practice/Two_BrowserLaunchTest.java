package Selenide_Practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;

public class Two_BrowserLaunchTest {

	@Test
	public void Two_browserLaunchTest() {
			
	//Option 1	
	//Configuration.browser = ("firefox");	
	
		
	//Option 2
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\Selenium\\geckodriver");	
	//Configuration.browser = ("firefox");
	
	//Option 3	
	System.setProperty("selenide.browser", "firefox");
	Configuration.headless = true;
	Configuration.baseUrl="https://www.google.co.in";
	Configuration.screenshots = true;
	open("/");
	$(By.name("q")).setValue("Naveen Automation Labs");
	$(By.name("btnK")).click();
	$(By.id("logo")).shouldHave(Condition.appear); 
	String name = $(By.xpath("//h3[text()='Welcome to Naveen AutomationLabs - naveen automationlabs']")).getText();
	Assert.assertEquals(name,"Welcome to Naveen AutomationLabs - naveen automationlabs");
	int headerLinks = $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
	System.out.println("Headers Links Count is "+headerLinks);
	
}
}