package AutomationPractice;

import org.testng.annotations.Test;

public class TestNGannotation {
	@Test
	public void nokia() {
		System.out.println("nokia");
	}
	@Test(priority=1)
	public void samsung() {
		System.out.println("samsung");
	}
	@Test(priority=-1,invocationCount=2)
	public void iphone() {
		System.out.println("iphone");
	}
	@Test(dependsOnMethods= {"realme"})
	public void moto() {
		System.out.println("moto");
	}
	@Test(enabled=true)
	public void realme() {
		System.out.println("realme");
	}
	@Test(enabled=false,alwaysRun=true)
	public void nokia1100() {
		System.out.println("nokia1100");
	}

}
