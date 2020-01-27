package part1;

import java.util.ArrayList;

public class sortDescending9 {

	public static void main(String[] args) {
		
		//Array -- Sort Descending
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(50);
		arr.add(5);
		arr.add(30);
		arr.add(13);
		
		desc(arr);

	}
	public static void desc(ArrayList<Integer> x) {
		
		for(int i=0; i<x.size(); i++) {
			for (int j = 0 ; j<x.size(); j++) {
				if(x.get(i) >= x.get(j)) {
					int temp = x.get(i);
					x.set(i, x.get(j));
					x.set(j, temp);
					
				}
			}
		}
		System.out.println(x);
		
	}

}
