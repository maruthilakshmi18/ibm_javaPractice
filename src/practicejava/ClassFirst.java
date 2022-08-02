package practicejava;

public class ClassFirst {
	
	int id;
	String name;
	String college;
	
 void getValue(int Sid, String Sname, String SCollege){
	
	 id=Sid;
	 name=Sname;
	 college=SCollege;
}
 
 void display() {
	 System.out.println(id);
	 System.out.println(name);
	 System.out.println(college);
 }

 
 public static void main (String args[]) {
	 
	 ClassFirst c =new ClassFirst();
	 c.getValue(9, "Lakshmi G", "SSN");
	 c.display();
	 
	 ClassFirst c1= new ClassFirst();
	 c1.getValue(10, "Lucky", "SSN");	 
	 c1.display();
 }
 
 
}
