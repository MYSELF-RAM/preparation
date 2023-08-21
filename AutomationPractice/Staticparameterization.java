package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//note : mention a  hard code parameter value in xml file and run 

public class Staticparameterization {
	public ChromeDriver driver;
	@Parameters({"url","uname","pass"})
	@Test
	public void leaf(String url,String uname,String pass) {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);      
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.className("decorativeSubmit")).click();   
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
	}

}
