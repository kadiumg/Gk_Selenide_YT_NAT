package Selenide_Practice;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class FourCloseQuitTest {

	@Test
	public void CloseQuitTest() throws InterruptedException {
		
		
// 		Funtions: SwitchTo(), closeWebDriver() - Quit() all, closeWindow() - close()			
		open("https://opensource-demo.orangehrmlive.com/"); // Parent window index is 0
		System.out.println(title());
		
		$("img[alt='OrangeHRM on youtube']").click(); // Child window index is 1 
		
		switchTo().window(0);
	
		System.out.println("Closing window"+title());
		closeWindow();
		
		Thread.sleep(3000);
		switchTo().window(0);
		System.out.println(title());
		
		closeWebDriver();
	}
	
}
