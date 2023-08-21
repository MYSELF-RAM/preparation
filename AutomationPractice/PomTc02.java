package AutomationPractice;

import org.testng.annotations.Test;

public class PomTc02 extends PomBase{
	@Test
	public void tc02() {
		PomLogin obj=new PomLogin(driver);
		obj.url().uname().pass().submit().crmsfa().lead().createlead();
		
	}
}
