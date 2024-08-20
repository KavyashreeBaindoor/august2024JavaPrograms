//5) Write a Java Program to count the number of words in a string using HashMap.

package InterviewStrings;

import java.util.HashMap;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="this is what it is this is";
		String[] arr=a.split(" ");
		
		HashMap<String,Integer> h=new HashMap<String, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(h.containsKey(arr[i])) {
				int val=h.get(arr[i]);
				h.put(arr[i],val+1);
				
			}
			else {
				h.put(arr[i],1);
			}
			
			
		}
		
		System.out.println(h);
		

	}

}
