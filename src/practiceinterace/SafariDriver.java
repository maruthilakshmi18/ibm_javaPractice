package practiceinterace;

public class SafariDriver implements WebDriver {
	
	public void get(String app) {
		System.out.println("luanch the application in safari browser :" +app);
		
	}
	
	public void findElement(String locator) {
		System.out.println("locator has been identified in safari browser :" +locator);
	}
	
	

}
