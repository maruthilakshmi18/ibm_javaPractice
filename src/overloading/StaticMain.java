package overloading;

public class StaticMain {

	public static void main(String[] args) {
		
		StaticOverload.AssertEquals("Lakshmi", "Lakshmi");
		StaticOverload.AsseretEquals("Lakshmi", "lakshmi", "Error msg");
		StaticOverload.AssertEquals("Lakshmi", "lakshmi");

	}

}
