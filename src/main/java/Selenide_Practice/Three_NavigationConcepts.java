package Selenide_Practice;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Three_NavigationConcepts {

	@Test
	public void navigateTest() throws InterruptedException {
		
//		Functions: 
//		Driver.getTitle();			 ==> title();
//		Driver.navigate().back();    ==> back();
//		Driver.navigate().forward(); ==> forward();
//		Driver.navigate().refresh(); ==> refresh();
	
		
		open("https://www.google.co.in/");
		System.out.println(title());
		
		open("https://www.amazon.com/");
		System.out.println(title());

		back();
		System.out.println(title());

		forward();
		System.out.println(title());
		
		back();
		System.out.println(title());
		
		Thread.sleep(3000);
		
		refresh();
	
	}
	
}
