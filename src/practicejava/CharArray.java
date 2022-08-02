package practicejava;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[]=  {'a','e','i', 'o', 'u'};
		
		for(int i=0; i<ch.length; i++) {
			
			System.out.println(ch[i]);
		}
		
		System.out.println("-----");
		for(char j : ch) {
			System.out.println(j);
		}
		
	}

}
