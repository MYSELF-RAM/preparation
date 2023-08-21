package AutomationPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> wh = driver.getWindowHandles();
		List<String>wh1=new ArrayList<String>(wh);
		WebDriver window = driver.switchTo().window(wh1.get(1));
		String title = window.getTitle();
		System.out.println(title);

	}

}
