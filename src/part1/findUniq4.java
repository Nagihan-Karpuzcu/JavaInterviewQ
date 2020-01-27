package part1;

import java.util.Arrays;
import java.util.Collections;

public class findUniq4 {

	public static void main(String[] args) {

		/**
		 * String -- Find the unique
		 * Write a return  method that can find the unique characters from the String
		 * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
		 */

		String a = "AAABBBCCCDEF";
		System.out.println(unique1(a));
		System.out.println(unique(a));
		System.out.println(Unique(a));

	}
	public static String unique1(String x) {

		String result = "";

		for (int i = 0; i<x.length(); i++) {

			int count = 0;
			
			for(int j = 0; j<x.length(); j++) {
				
				if((x.charAt(i) == x.charAt(j))) {

					count ++;

				}
			}
			
			if (count == 1) {
				result += "" + x.charAt(i);
			}

		}
		return result;


	}
	public static String unique(String str) {

		String[ ] arr=str.split("");

		String unique1="";

		for(int j=0; j<arr.length; j++) {

			int num=0;

			for(int i=0; i<arr.length; i++ ) {

				if(arr[i].equals(arr[j]) )

					num++;

			}

			if(num==1) 

				unique1+=arr[j];

		}

		return unique1;

	}
	
	public static String Unique(String str) {

		String result ="";

		for(String each : str.split(""))

		result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";

		 

		return result;

		}
}