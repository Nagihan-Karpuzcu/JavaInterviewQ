package part1;

public class findMin7 {
	
	public static void name(String[] args) {
		
		/*
		 * Write a method that can find the minimum number from an int Array
		 */
		
		int[] arr = {1,13,5,200,56};

		System.out.println(min(arr));
		
	}

	public static int min(int[] a) {
		
		int min = Integer.MAX_VALUE;
		
		for (int each  : a) {
			if(each<min) {
				min = each;
			}
		}
		
		return min;
	}
	
}