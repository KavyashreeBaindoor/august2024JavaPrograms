package InterviewStrings;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="kavyakavya";
		
		String[] arr=a.split("");
		System.out.println(Arrays.toString(arr)); //[k, a, v, y, a]
		
		hashing(arr);
		looping(a);
		
	}
	
	
	public static void hashing(String[] arr) {
	
		String res="";
		
	HashMap<String,String> h=new HashMap<String,String>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(h.containsKey(arr[i])) {
					
			}
			else {
				
				h.put(arr[i], arr[i]);
				res+=h.get(arr[i]);
			}
		
			}
		
System.out.println(res);
	}
	
	
	public static void looping(String a) {
		
		char[] b=a.toCharArray();
		System.out.println(Arrays.toString(b));//[k, a, v, y, a, k, a, v, y, a]
		
		int index=0;
		for(int i=0;i<b.length;i++) {
			int j;
			for( j=0;j<i;j++) {
				if(b[i]==b[j]) {
					break;
				}
			}
			
			if(j==i) {
				b[index++]=b[i];
			}
			
			   
		}
		
		System.out.println(String.valueOf(Arrays.copyOf(b, index)));
	}

}
