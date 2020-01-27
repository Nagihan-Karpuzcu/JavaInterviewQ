package part1;

import java.util.Arrays;
import java.util.TreeSet;

public class sameLetters2 {

	public static void main(String[] args) {

		/**
		 * String -- Same letters
		 * Write a return method that check if a string is build out of the same letters as another string.
		 * Ex:  same("abc",  "cab"); -> true 
		 * same("abc",  "abb"); -> false:
		 */

		String x = "abc";
		String y = "cab";

		System.out.println(same(x, y));
		System.out.println(Same(x, y));
	}
	public static boolean same(String a, String b) {

		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String a1="", a2="";

		for(char each: ch1)

			a1 +=each;

		for(char each: ch2)

			a2 +=each;

		return  a1.equals(a2) ;

	}

	public static boolean Same(String str1, String str2) {

		str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

		str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

		return  str1.equals(str2);

	}
}