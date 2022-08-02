package inheritance;

public class ClassB extends ClassA {
	
	void verify() {
		System.out.println("Verify B class");
	}
	
	void display() {
		System.out.println("B class method");
	}
	
	public static void main(String args[]) {
		ClassB b= new ClassB();
		b.display();
		b.verify();
		b.validate();
	}

}
