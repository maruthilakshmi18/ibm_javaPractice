package practicejava;

public class ArrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1, 2, 3, 4, 5, 6, -2};
		int sum=0;
		for(int i : a) {
			
			sum =sum + i;
			
		}
		System.out.println(sum);
	}

}
