package part1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeDublic3 {

	public static void main(String[] args) {

		/**
		 * String -- Remove Duplicates
		 * Write a return method that can remove the duplicated values from String
		 * Ex:  removeDup("AAABBBCCC")  ==> ABC
		 */

		String x= "AAABBBCCC";

		System.out.println(removeDublicate(x));
		System.out.println(removeDup(x));

	}
	public static String removeDublicate(String a) {

		String result="";

		for (int i = 0; i<a.length(); i++) {
			if(!result.contains(""+a.charAt(i))) {
				result +=""+a.charAt(i);
			}
		}
		return result;

	}
	public static String removeDup(String str) {

		str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

		str = str.replace(", ","").replace("[","").replace("]","");

		return  str;

	}

}
