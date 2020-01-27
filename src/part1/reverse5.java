package part1;

import java.util.Arrays;

public class reverse5 {

	public static void main(String[] args) {

		/**
		 * String -- Reverse
		 * Write a return method that can reverse  String
		 * Ex: Reverse("ABCD"); ==> DCBA
		 */

		String a = "ABCD";

		reverse(a);

		System.out.println(StrReverse2(a));
		
		System.out.println(Reverse(a));

	}

	public static void reverse (String a) {

		String[] arr = a.split("");


		for (int i = 0; i< arr.length/2 ; i++) {

			String temp = arr[i];

			arr[i] = arr[arr.length-(i+1)];

			arr[arr.length-(i+1)] = temp;

		}
		System.out.println(Arrays.toString(arr));

	}

	public static String StrReverse2(String str) {

		String reverse="";

		for(int i=str.length()-1; i >= 0; i--)

			reverse += str.toCharArray()[i];

		return  reverse;

	}
	public  static String  Reverse(String str) {

		return new StringBuffer(str).reverse().toString();

	}

}
