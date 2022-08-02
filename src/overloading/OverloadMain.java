package overloading;

public class OverloadMain {
	
	public static void main(String args[]) {
		ValidateOverload vv= new ValidateOverload();
		vv.AssertEquals("Lakshmi", "lakshmi");
		vv.AssertEquals("Lakshmi", "lakshmi", "not matched");
		
		
	}

}
