package pageobject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Base.BaseClass;


public class Register extends BaseClass  {
	
        By getstart = By.xpath("//div[@class='content']//button");
		By Register = By.xpath("//div/ul/a[2]");
		By username = By.xpath("//input[@name='username']");
		By Pwd      = By.xpath("//input[@name='password1']");
		By confpwd  = By.xpath("//input[@name='password2']");
		By Reg      = By.xpath("//input[@type='submit']");
		
	@Test


	public void Reg() {
		
		//WebDriver driver = new ChromeDriver();
		
		 //System.setProperty("webdriver.chrom.driver", "/QAProject1/src/test/resources/drivers/chromedriver.exe");
		 
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//	driver.manage().window().maximize();
		//	driver.get("https://dsportalapp.herokuapp.com/");
			
		//BaseClass.Launch();
		
			//driver.findElement(getstart).click();
			driver.findElement(Register).click();
			driver.findElement(username).sendKeys("Selenium890");
			driver.findElement(Pwd).sendKeys("Selenium@123");
			driver.findElement(confpwd).sendKeys("Selenium@123");
			driver.findElement(Reg).click();
			
	}




		
	}
			
			
			
			


