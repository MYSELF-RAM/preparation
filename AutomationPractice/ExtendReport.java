package AutomationPractice;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter repo=new ExtentHtmlReporter("./ramtest/result.html");
		ExtentReports ex=new ExtentReports();
		ex.attachReporter(repo);
		ExtentTest test = ex.createTest("login", "leaftap");
		test.assignAuthor("ram");
		test.pass("username");
		test.pass("pass");
		test.fail("submit");
		ex.flush();
		System.out.println("done");

	}

}
