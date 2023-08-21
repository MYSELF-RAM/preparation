package AutomationPractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNgsequential1 extends TestNgSequential{
	@Test
	public void crm() {

	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();

}}
