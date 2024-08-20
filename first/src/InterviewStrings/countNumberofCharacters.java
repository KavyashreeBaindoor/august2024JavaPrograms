package InterviewStrings;

import java.util.Arrays;
import java.util.HashMap;

public class countNumberofCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="kavyakavya";
		
		String[] arr=a.split("");
		System.out.println(Arrays.toString(arr)); //[k, a, v, y, a]
		
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(h.containsKey(arr[i])) {
				
				int val=h.get(arr[i]);
				h.put(arr[i], val+1);
				
			}
			else {
				h.put(arr[i], 1);
			}
			
		}
		
		System.out.println(h);

	}

}
