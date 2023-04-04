package Base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.*;

public class BaseClass {
	
 
	public ChromeOptions options = new ChromeOptions();
	public void setOptions(ChromeOptions options) {
		this.options = options.addArguments("--remote-allow-origins=*");
	}
	//public WebDriver driver = new ChromeDriver(options);
	public static WebDriver driver = new FirefoxDriver();
	
	 
	
	public static Properties prop;
	
public static void Launch() {
	
	//WebDriver driver = new ChromeDriver();
	prop = new Properties();
	
	String projectDir=System.getProperty("user.dir");
	//String path=projectDir+"/src/test/resources/Configuration/Config.properties";
	String path=projectDir+"\\src\\test\\resources\\Configuration\\Conf.properties";
	//String  path1 = "C:\\Users\\Shan\\eclipse-workspace\\QAProject1\\src\\test\\resources\\Configuration\\conf.properties";
	FileReader ip;
	try {
System.out.println(projectDir);
System.out.println(path);

		ip = new FileReader(path);
		
		prop.load(ip);
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	

	}
	
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.setProperty("webdriver.chrome.driver", "/QAProject/src/test/resources/drivers/chromedriver.exe");
	 System.setProperty("webdriver.gecko.driver","/QAProject/src/test/resources/drivers/geckodriver.exe");
	 
	/* ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
	 ChromeDriver driver = new ChromeDriver(options);
	 */
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://dsportalapp.herokuapp.com/");
		
}



}
