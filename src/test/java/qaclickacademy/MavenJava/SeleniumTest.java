package qaclickacademy.MavenJava;

import org.testng.annotations.Test;

public class SeleniumTest {
	//triggering the testng file from maven
	//how to execute testcases from test folder cmd->mvn test
	@Test
	public void browserAutomation() {
		System.out.println("browserAutomation");
	}
	@Test
	public void elementsUI() {
		System.out.println("elementsUI");
		
	}
	
}
