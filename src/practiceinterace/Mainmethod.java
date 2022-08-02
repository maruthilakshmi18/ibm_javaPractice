package practiceinterace;

public class Mainmethod {

	public static void main(String[] args) {
		
		ChromeDriver d= new ChromeDriver();
		d.get("www.google.com");
		d.findElement("xpath");
		
		System.out.println("---------------");
		
		SafariDriver sf= new SafariDriver();		
		sf.get("www.qa.com");
		sf.findElement("cssselector");
	}

}
