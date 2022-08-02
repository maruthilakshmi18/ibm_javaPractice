package overloading;

public class StaticOverload {
	
	public static void AssertEquals(String Etext, String Atext) {
		System.out.println(Etext.equalsIgnoreCase(Atext));
	}
	
	public static void AsseretEquals(String Actual, String Expected, String Errormsg) {
		System.out.println(Actual.equalsIgnoreCase(Expected));
		//System.out.println(Errormsg);
	}

}
