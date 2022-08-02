package FristTestCaseJunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Executionjunit {
	
	@After
	public void postCondition() {
		System.out.println("click on logout and close the browser");
	}
	
	@Test
	
	public void login() {
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on login button");
		System.out.println("welcome screen displayed");
	}
	

	@Before 
	public void preCondition() {
		System.out.println("open the url in chrome browser");
	}
	
	

}
