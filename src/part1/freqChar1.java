package part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class freqChar1 {

	public static void main(String[] args) {

		/**
		 * String -- Frequency of Characters
		 * Write a return method that can find the frequency of characters
		 * Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
		 */

		String a = "AAABBCDD";
		System.out.println(FrequencyOfChars(a));
		System.out.println(FrequencyOfChars2(a));
		System.out.println(FrequencyOfChars3(a));
		System.out.println(frequency(a));
	}

	public static String FrequencyOfChars(String str) {

		String nonDup = "";

		for(int i=0; i < str.length(); i++)

			if(!nonDup.contains(""+str.charAt(i)))

				nonDup+= ""+str.charAt(i);

		String expectedResult = "";

		for( int j=0;j < nonDup.length(); j++) {

			int count = 0;

			for(int i=0; i < str.length(); i++) {

				if(str.charAt(i) == nonDup.charAt(j))

					count++;

			}
			expectedResult +=nonDup.charAt(j)+ "" + count;

		}

		return expectedResult;

	}
	public  static  String  FrequencyOfChars2(String str2) {

		String expectedResult = "";

		int j=0;

		while( j < str2.length()) {

			int count = 0;

			for(int i=0; i < str2.length(); i++) {

				if(str2.charAt(i) == str2.charAt(j)) {

					count++;

				}

			}

			expectedResult += str2.charAt(j)+ "" + count;

			str2 = str2.replace(""+str2.charAt(j) ,  "" ); 

		}

		return expectedResult;

	}

	public  static  String  FrequencyOfChars3(String str) {

		String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

		b = b.replace(", ","").replace("[","").replace("]","");

		String result="";


		for(int j=0; j<b.length();j++) {

			int count=0;



			for(int i=0; i<str.length(); i++)

				if(str.substring(i, i+1).equals(""+str.charAt(j)))


					result+=b.substring(j, j+1)+count;

		}

		return result;

	}

	public static String frequency(String str) {

		String nonDup="", result="";

		for(int i=0; i < str.length(); i++)

			if(! nonDup.contains(""+str.charAt(i)))

				nonDup += ""+str.charAt(i);

		for(int i=0; i < nonDup.length(); i++) {

			int num = Collections.frequency(Arrays.asList(str.split("") ), ""+nonDup.charAt( i ) );

			result += ""+nonDup.charAt(i) + num;

		}
		return result;

	}

}

