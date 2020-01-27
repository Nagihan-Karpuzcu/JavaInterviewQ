package part2;

public class divideWithOper {

	public static void main(String[] args) {
		
		//Write a method that can divide two numbers without using division operator

		int num1 = 25;
		int num2 = 5;
		
		divide(num1, num2);
		
		
	}
	public static void divide(int n1, int n2) {
		
		if (n2 == 0) {
			System.out.println("Invalid Number");
			
		}
		
		int n3 = n1;
		
		int count = 0;
		
		while (n1>=n2) {
			
			n1-= n2;
			count ++;
			
		}
		
		System.out.println(n3 + " divided " + n2 + " equals " + count);
		
		
	}
	

}
