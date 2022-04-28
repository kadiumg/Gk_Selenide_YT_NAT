package Selenide_Practice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.*;


public class One_GoogleTest {

	
	@Test
	
	public void googleSearchTest() {
		open("https://www.google.co.in/");
		$(By.name("q")).setValue("Naveen Automation Labs");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear); 
		String name = $(By.xpath("//h3[text()='Welcome to Naveen AutomationLabs - naveen automationlabs']")).getText();
		Assert.assertEquals(name,"Welcome to Naveen AutomationLabs - naveen automationlabs");
		int headerLinks = $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
		System.out.println("Headers Links Count is "+headerLinks);
		
		$$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(11));
		}
	
	
}
