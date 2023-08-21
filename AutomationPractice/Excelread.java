package AutomationPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelread {
	@DataProvider(name="getdata")
	public String[][] fetchdata() throws IOException {
		String [][]xl=Excelread1.exceldata();
		return xl;
		}
	@Test(dataProvider="getdata")
	public void leaf(String phno,String UpCname) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");      
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();   
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(phno);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(UpCname);
		driver.findElement(By.className("smallSubmit")).click();

	}

}
