package Selenide_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Eleven_MouseOver_DragDrop_RightClick {
	
	@Test (priority = 3)
	public void MouseOverTest() throws InterruptedException {
		
		open("https://www.spicejet.com/");
		SelenideElement addOn = $(By.xpath("//div[text()='Add-ons']"));
		SelenideElement visa = $(By.xpath("//div[text()='Visa Services']"));
		
		actions().moveToElement(addOn).build().perform();
		visa.click();
		closeWindow();
		
		Thread.sleep(3000);
	}
	
	
	@Test (priority = 2)
	public void DragAndDropTest() throws InterruptedException {
		
		open("https://jqueryui.com/droppable/");
		switchTo().frame($(By.xpath("//iframe[@class='demo-frame']")));
		
		SelenideElement Source = $(By.id("draggable"));
		SelenideElement target = $(By.id("droppable"));
		
		
		//Option 1
	//	actions().dragAndDrop(Source, target).build().perform();
		
		//Option 2
		//actions().clickAndHold(Source).moveToElement(target).release().build().perform();
		
		actions().clickAndHold(Source).release(target).build().perform();
		SelenideElement dropped = $(By.xpath("//div/p[text()='Dropped!']"));
		boolean flag = dropped.isDisplayed();
		System.out.println(flag);
		Thread.sleep(5000);
	}
	
	@Test (priority = 1)
	public void contextClickTest() throws InterruptedException {
		
		open("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		SelenideElement rbutton = $(By.xpath("//p/span[text()='right click me']"));
		actions().contextClick(rbutton).build().perform();
		$(By.xpath("//li/span[text()='Copy']")).click();
		
		Thread.sleep(3000);
		
		Alert ale = switchTo().alert();
		ale.accept();
		
		Thread.sleep(3000);
		
		
		
	}
}
