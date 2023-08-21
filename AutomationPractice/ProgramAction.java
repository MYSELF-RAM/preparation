package AutomationPractice;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgramAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node019p4w8tive7ttm2mw4bt3hq2p435906.node0");
		WebElement action = driver.findElement(By.xpath("//div[@id='form:conpnl_content']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(action, 50, 50).perform();

	}

}
