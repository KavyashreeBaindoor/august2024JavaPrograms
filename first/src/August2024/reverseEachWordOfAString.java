package August2024;

import java.util.Arrays;

public class reverseEachWordOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="my name is kavya";
		String[] arr=a.split(" ");
		String rev="";
		int k;
		
		
		for(int i=0;i<arr.length;i++) {
			k=1;
			
		for(int j=0;j<arr[i].length();j++) {
			rev+=arr[i].charAt(arr[i].length()-k);
			k++;
			
			}
			
			rev+=" ";
				
		}
		
		
		System.out.println(rev);
		
		
		
		

	}

}
