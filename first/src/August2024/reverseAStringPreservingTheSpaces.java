package August2024;

import java.util.Arrays;

public class reverseAStringPreservingTheSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="i am kavya";
		
		char[] arr=new char[a.length()];
		int j=1;
		
		for(int i=0;i<a.length();i++)
		{
		arr[i]=a.charAt(a.length()-j);
			j++;
				
		}
		
		String a1=new String(arr);
		System.out.println(a1);
		
		
	}

}
