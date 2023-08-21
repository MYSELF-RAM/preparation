package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pomcrmsfa extends PomBase{
	public Pomcrmsfa(ChromeDriver driver) {
		this.driver=driver;
	}

	public Pomcrmsfa crmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return this;

	}
	public Pomcrmsfa lead() {
		driver.findElement(By.linkText("Leads")).click();
		return this;
		
	}
	public Pomcrmsfa createlead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return this;

	}
}
