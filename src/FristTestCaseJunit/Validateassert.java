package FristTestCaseJunit;

import org.junit.Assert;
//import org.junit.Assert;
import org.junit.Test;

//import junit.framework.Assert;

public class Validateassert {

	@Test
	public void validate() {
	String ExpectedText ="Maruthi Lakshmi";
	String ActualText="Maruthi Lakshmi";
	
	int Ecount= 1000;
	int Acount= 100;
	
	Assert.assertEquals(ExpectedText, ActualText);
	Assert.assertEquals("text is mismatched",ExpectedText, ActualText);
	
	Assert.assertFalse("count is mismatched",Ecount==Acount);
	
}
}
