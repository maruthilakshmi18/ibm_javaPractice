package Config;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	public ReadConfig() throws Exception {
	
		FileInputStream fis=new FileInputStream("./data/config.properties");
		 prop= new Properties();
		prop.load(fis);
	}
	
	
	public String readQAurl()
	{
		String qaurl= prop.getProperty("qaURL");
		return qaurl;
	}
	
	public String readdevURL() {
		String devurl=prop.getProperty("devURL");
		return devurl;
				
		
	}
	
	public String readusername() {
		String uname=prop.getProperty("username");
		return uname;
	}
	
	public String readpassword() {
		String pwd=prop.getProperty("Password");
		return pwd;
	}

}
