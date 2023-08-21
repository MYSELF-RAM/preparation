package AutomationPractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNgpara1 extends TestNGparallel {
	@Test
	public void crmsfa() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	}

}
