package FristTestCaseJunit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTestNgSample {

	@Test
	public void validate() {
	String ExpectedText ="Maruthi Lakshmi";
	String ActualText="Maruthi Lakshmi";
	
	int Ecount= 1000;
	int Acount= 1000;
	
	//Assert.assertEquals(ExpectedText, ActualText);
	Assert.assertEquals("text is mismatched",ExpectedText, ActualText);
	Assert.assertEquals("text is mismatched",Ecount==Acount);
	
}
	
}
