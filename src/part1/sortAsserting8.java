package part1;

import java.util.ArrayList;
import java.util.Arrays;

public class sortAsserting8 {

	public static void main(String[] args) {
		
		/*
		 *Write a return method that can sort an int array 
		 *in Ascending order without using the sort method of 
		 *the Arrays class 
		 */

		int[] arr = {10,6,4,3,7,2};
	
		System.out.println(Arrays.toString(sortArrayAlgorithm(arr)));
		
	}
	public static int[] sortArrayAlgorithm(int[] array) { //sort in descending order
	    
		for (int i = 0; i < array.length; i++) {
	        for (int j = 0; j < array.length; j++) {
	            if (array[i] <= array[j]) {
	                int x = array[i];
	                array[i] = array[j];
	                array[j] = x;
	            }
	        }
	    }
	    return array;
	}
	

}
