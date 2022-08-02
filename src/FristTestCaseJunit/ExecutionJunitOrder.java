package FristTestCaseJunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExecutionJunitOrder {

	@After
	public void postConditionFinal() {
		System.out.println("close the browser");
	}
	
	@After
	public void postCondition() {
		System.out.println("click on logout");
	}
	

	@Test
	
	public void login() {
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on login button");
		System.out.println("welcome screen displayed");
	}
	

	
	@Before 
	public void preConditionFinal() {
		System.out.println("Launch the url");
	}
	
	@Before 
	public void preCondition() {
		System.out.println("open the chrome browser");
	}
	
}
