package FristTestCaseJunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;



//@TestMethodOrder(OrderAnnotation.class)
//@TestMethodOrder(Alphanu.class)
public class SecondTestCase {
	
	@BeforeClass
	public static void openConnection() {
		System.out.println("Connect to DB");
		System.out.println("----------");
	}
	
	
	@AfterClass
	
	public static void CloseConnection() {
		System.out.println("Close all connections");
	}

	
	@Before
	public void luanchAPP() {
		System.out.println("open the application");
	}
	
	@After
	public void clsoeApp() {
		System.out.println("Close the application");
		System.out.println("---------------");
	}
	
	@Test
	@Order(1)
	public void login_1() {
		System.out.println("TC1-login successfull");
	}
	
	@Test
	@Order(2)
	public void login_2() {
		System.out.println("TC2-login successfull");
	}
	
	@Test
	@Order(3)
	public void login_3() {
		System.out.println("TC3-login successfull");
	}
	
	@Test
	@Order(4)
	public void login_4() {
		System.out.println("TC4-login successfull");
	}
	
}
