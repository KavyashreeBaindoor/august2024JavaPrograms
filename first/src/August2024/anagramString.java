package August2024;

import java.util.ArrayList;

public class anagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="heart";
		String b="earth";
		boolean flag=true;
		
		
		for(int i=0;i<a.length();i++) {
			if(b.indexOf(a.charAt(i)) == -1)
				flag=false;
			}
		
		
		if(flag) 
			System.out.println("it is anagram");
		else
			System.out.println("it is not a anagram");
		

	}

}
