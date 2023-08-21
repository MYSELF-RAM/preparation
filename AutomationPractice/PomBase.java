package AutomationPractice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class PomBase {
	public  ChromeDriver driver;  // parallel mode
//	@BeforeMethod
	public PomLogin url() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//assignment 1 create lead
		
		driver.get("http://leaftaps.com/opentaps/control/main");     
		return new PomLogin(driver);   // for parallel mode we pass the driver

		
	}
	
	

}
