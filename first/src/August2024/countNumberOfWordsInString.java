package August2024;

import java.util.Arrays;

public class countNumberOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String k="i am kavya,i am from bangalore hey people";
		String a= k.replaceAll(",", " ");//to remove ,
		
		
		
		//1 way
		String[] arr=a.split(" ");
		System.out.println(arr.length);
		
		
		//2nd way
		
		
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==' ' && a.charAt(i+1)!= ' ')  //checking for space character
				count++;	
			
		}
		
		
		System.out.println(count+1);
	}

}
