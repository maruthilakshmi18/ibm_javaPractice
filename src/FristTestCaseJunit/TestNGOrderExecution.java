package FristTestCaseJunit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGOrderExecution {
	
	@BeforeMethod
	public void openAllwindows() {
		System.out.println("open all windows");
	}
	
	@BeforeTest
	public void open() {
		System.out.println("open connection");
	}
	
	@BeforeClass
	public void openAll() {
		System.out.println("open browser");
	}
	
	
	
	@Test
	public void display() {
		System.out.println("TC1 login");
	}
	
	
	@Test
	public void verify() {
		System.out.println("TC2 login");
	}
	
	@Test
	public void validate() {
		System.out.println("TC3 login");
	}
	
	@AfterTest
	public void close() {
		System.out.println("Close connection");
	}
	
	@AfterClass
	public void closeAll() {
		System.out.println("close browser");
	}
	
	@AfterMethod
	public void closeAllwindows() {
		System.out.println("close all windows");
	}
}
