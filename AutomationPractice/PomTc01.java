package AutomationPractice;

import org.testng.annotations.Test;

public class PomTc01 extends PomBase{

	
	@Test
	public void tc01() {
		PomLogin obj=new PomLogin(driver);
		obj.url().uname().pass().submit();
	}
}
