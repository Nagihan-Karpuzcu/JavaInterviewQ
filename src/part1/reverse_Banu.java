package part1;

public class reverse_Banu {

	public static void main(String[] args) {


		String mainMethod="ELFGPBV";

		System.out.println(reversing(mainMethod));

	}
	public static String reversing(String s){
		char[] arr = s.toCharArray();
		char[] arr2= new char[s.length()];
		String result="";

		for(int i=0, j=s.length()-1; i<s.length() && j>=0; i++, j--){
			arr2[i]=arr[j];
			result += Character.toString(arr2[i]);
		}
		return result;

	}

}
