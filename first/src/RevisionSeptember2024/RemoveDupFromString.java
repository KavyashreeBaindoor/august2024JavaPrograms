package RevisionSeptember2024;

import java.util.HashSet;

public class RemoveDupFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="kavya";    //   ---- kavy
		char[] c=a.toCharArray();
		String res="";
		
		HashSet<Character> h=new HashSet<Character>();
		for(Character a1:c) {
			h.add(a1);
		}
		
		System.out.println(h);
		
		for(Character k:h) {
			res+=k;
		}
		
	System.out.println(res);
	
	}

}
