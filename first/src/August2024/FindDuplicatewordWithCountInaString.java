package August2024;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicatewordWithCountInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="i am kavya i am";
		String[] arr=a.split(" ");
		//System.out.println(Arrays.toString(arr));
		
		
		HashMap<String,Integer> h=new HashMap<String, Integer>();
		
		
	for(int i=0;i<arr.length;i++) {
		
		if(h.containsKey(arr[i]))
		{
			int val=h.get(arr[i]);
			h.put(arr[i], val+1);
			
			
		}
			else
				h.put(arr[i], 1);
		
	}
		
System.out.println(h);
	
	
	
	
	}

}
