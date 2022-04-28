package Selenide_Practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;

public class Nine_FindElements {

	@SuppressWarnings("deprecation")
	@Test
	public void FineElementsTest() {
				
		Configuration.headless = true;
		
		open("https://www.amazon.com/");
		ElementsCollection Coll = $$(By.tagName("a"));
		System.out.println(Coll.size());
		
		
//		for(SelenideElement e : Coll) {
//			String text = e.getText();
//			String href = e.getAttribute("href");
//			System.out.println(text+"------->"+href);
//		}
		
		Coll.shouldHave(CollectionCondition.sizeLessThan(400), Duration.ofSeconds(5));
		Coll.forEach(e -> System.out.println(e.getText()));
		//Coll.stream().filter(e -> !e.getText().isEmpty()).forEach(e -> System.out.println(e.getText()));
		//Coll.last(10).forEach(e -> System.out.println(e.getText()));
	}
}
