package August2024;

import java.util.HashMap;

public class checkOccurenceOfCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="kavya";
		
		char[] arr=a.toCharArray();
		int val=0;
		
		HashMap<Character,Integer> h=new HashMap<Character, Integer>();
		
		for(Character c:arr) {
			if(h.containsKey(c)) {
				val=h.get(c);
				h.put(c, val+1);
				}
			else
				h.put(c, 1);
		}
		
		System.out.println(h);
		
		withoutForLoop();
		
	}
	
	
	public static void withoutForLoop() {
		
		String b="navya";
		
		//checking the occurence of a in the string
		int count = b.length()-b.replace("a", "").length();
		System.out.println(count);
		
		
		
		
		
	}

}
