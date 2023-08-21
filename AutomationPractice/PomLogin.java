package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomLogin extends PomBase {
	public PomLogin(ChromeDriver driver) {  // for parallel mode
		this.driver=driver;
	}
	
	
	public PomLogin uname() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
		
		 
		
	}
	public PomLogin pass() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public Pomcrmsfa submit() {
		driver.findElement(By.className("decorativeSubmit")).click();  
		return new Pomcrmsfa(driver);
	}

}
