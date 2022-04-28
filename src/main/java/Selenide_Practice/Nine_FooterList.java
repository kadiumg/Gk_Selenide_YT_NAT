package Selenide_Practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.*;

import java.util.List;

public class Nine_FooterList {

	
	@Test
	public void FindElementsFooter() {
			
		Configuration.headless =  true;
		open("https://www.freshworks.com/");
		ElementsCollection Coll = $$(By.xpath("//footer//ul//li//a"));
		System.out.println("Collections Size is: "+Coll.size());
		
		//Coll.forEach(e -> System.out.println(e.getText()));
		//Coll.last(10).forEach(e -> System.out.println(e.getText()));
		List<String> footerTextList = Coll.texts();
		footerTextList.forEach(e -> System.out.println(e));
	
	}
}
