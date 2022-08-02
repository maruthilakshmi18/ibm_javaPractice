package test;

import Config.ReadConfig;

public class TestClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ReadConfig obj= new ReadConfig();
		System.out.println(obj.readQAurl());
		System.out.println(obj.readdevURL());
		System.out.println(obj.readusername());
		System.out.println(obj.readpassword());
		
	}

}
