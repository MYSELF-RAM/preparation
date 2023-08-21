package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterization {
	@DataProvider(name="getdata")
	public String[][] fetchdata() {
		String[][]data=new String[2][4];
		data[0][0]="testleaf";
		data[0][1]="D";
		data[0][2]="ram";
		data[0][3]="ram90s";
		data[1][0]="testleaf";
		data[1][1]="k";
		data[1][2]="dhan";
		data[1][3]="d50";
		return data;
		}
	@Test(dataProvider="getdata")
	public void leaf(String cname,String fname,String lname,String local) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");      
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();   
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(local);
		driver.findElement(By.className("smallSubmit")).click();
		
		
	}
}
