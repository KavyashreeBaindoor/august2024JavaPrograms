//find the duplicate character in a string

package InterviewStrings;

import java.util.HashMap;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="kavyakk";   //a
		char[] arr=name.toCharArray(); //['k','a'..]
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			    for(int j=i+1;j<arr.length;j++ ) {
			    		if(arr[i]== arr[j]) {
			    		count++;
			    	System.out.println("repeated char is "+arr[i]);
			    	
			    		}
				
			}
			 
			
		}
		
		
		//hasmap works only on string array not char array
		
		String[] arr1=name.split("");//converting string to string array
		
		HashMap<String,Integer> h=new HashMap<String, Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			if(h.containsKey(arr1[i])) {
				int val=h.get(arr1[i]);
				h.put(arr1[i],val+1);
				
			}else {
				h.put(arr1[i], 1);
			}
			
		}
		
System.out.println(h);
	}

}
