package practiceinterace;

public class ChromeDriver implements WebDriver {
	
	public void get(String app) {
		System.out.println("launch the appliaction urlin chrome :" +app);
	}
	
	public void findElement(String locator) {
		System.out.println("Locatore has been identified in chrome :" +locator);
	}

}
