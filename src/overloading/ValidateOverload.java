package overloading;

public class ValidateOverload {

	public void AssertEquals(String Avalue, String Evalue) {
		System.out.println(Avalue.equalsIgnoreCase(Evalue));
	}
	
	public void AssertEquals(String Actual, String Expected, String Errormsg) {
		System.out.println(Actual.equals(Expected));
		System.out.println(Errormsg);
	}
}
