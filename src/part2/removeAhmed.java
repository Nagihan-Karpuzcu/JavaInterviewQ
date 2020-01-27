package part2;

import java.util.ArrayList;
import java.util.Collections;

public class removeAhmed {

	/*
	    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
	    Write a java operation to remove all the names named Ahmed
	 */
	
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<>();
		
		list.add("Ahmed");
		list.add("John");
		list.add("Eric");
		list.add("Ahmed Nazif");
		list.add("Tom Ahmed");
		list.add("Michael");
		list.add("Ozzy");
		
//		for (String each : list) {
//			if(each.contains("Ahmed")){
//				each = remove(each);
//				
//			}
//		}
//		
		for(int i=0; i<list.size();i++){
			if(list.get(i).contains("Ahmed")){
			list.remove(i);
			i=0;
			}
		}
//		System.out.println(list);
	}

}

