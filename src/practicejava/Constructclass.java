package practicejava;

public class Constructclass {
	
	int id;
	String name;
	String college;

	Constructclass(int Sid, String Sname, String SCollege){
		
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
		 
		 Constructclass c =new Constructclass(9, "Lakshmi G", "SSN");
				 c.display();
		 
		 Constructclass c1= new Constructclass(10, "Lucky", "SSN");
				 c1.display();
	 }
	 

}
