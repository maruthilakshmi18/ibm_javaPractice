package practicejava;

public class VerifyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        
		        //String - 
		        
		        String s = "Welcome";
		        String s2 = "welcome";
		        String s1= "to Java";
		        
		        // 0    1   2   3   4   5   6
		        // w    e   l   c   o   m   e
		        
		        //length of string
		        System.out.println(s.length());
		        
		        //Concat
		    
		        System.out.println(s+s1);
		        System.out.println(s.concat(s1));
		        
		        
		        //contains
		        String expectedTitle = "iphone 14";
		        String actualTitle = "Amazon.in : iphone 14 : ibm automation : appim automation";
		        
		        System.out.println(actualTitle.contains(expectedTitle));           //true
		        
		        
		        //Equals
		        System.out.println(s.equals(s2));                                   //false   
		        
		        
		        //EqualsIgnoreCase
		        System.out.println(s.equalsIgnoreCase(s2));                         //Welcome    welcome
		        
		        
		        //Replace
		        System.out.println(s1.replace("Java", "PYTHON"));
		        
		        
		        //Sub-String
		        System.out.println(s.substring(1, 6));
		        
		        //Split
		        
		        String [] arrofElement = actualTitle.split(":", 2);
		        
		        for(String  var: arrofElement)
		        {
		            
		            System.out.println(var);
		        }
		        
		        
		  String st= "     Welcome   ";      
		        
		  System.out.println(st.trim());
		

	
	}
		

	}


