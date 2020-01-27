package part1;

import java.util.Arrays;

public class findMax6 {

	public static void main(String[] args) {

		/**
		 * Array -- Find Maximum
		 * Write a method that can find the maximum number from an int Array
		 */

		int[] arr = {1,13,5,200,56};

		System.out.println(max(arr));

		System.out.println(maxValue(arr));
		System.out.println(maxValue2(arr));
	}

	public static int max(int[] a) {

		int max=0;

		for (int i =0; i<a.length ; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}

		return max;
	}

	public static int maxValue( int[]  n ) {

		int max = Integer.MIN_VALUE;

		for(int each: n)

			if(each > max)

				max = each;
		return max;

	}

	public static int maxValue2( int[]  n ) {

		Arrays.sort( n );

		return  n[ n.length-1 ];

	}

}
