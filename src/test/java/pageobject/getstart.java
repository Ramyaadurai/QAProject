package pageobject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseClass;

public class getstart extends BaseClass {
	
	//By Getstart = By.xpath("//button[text()='Get Started']");
	By Getstart = By.xpath("//button[@class='btn']");
	

@Test

public void Getstart() {
	
	
	

		
		Launch();
		
		driver.findElement(Getstart).click();

	
	
}

}