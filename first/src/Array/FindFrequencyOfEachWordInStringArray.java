package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFrequencyOfEachWordInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr= {"i","am","from","bangalore"};
		
		
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		int val=0;
		
		for(String a:arr) {
			
			if(h.containsKey(a)) {
				
				 val=h.get(a);
				h.put(a, val+1);
				
			}else
				
				h.put(a, 1);
			
			
		}
		
		
		 
		
		System.out.println(h);
		
		System.out.println(h.entrySet());
		
		
		
		
		
		for(Entry<String, Integer> k:h.entrySet()) {
			System.out.println("word:  "+k.getKey()+"frequency is:  "+k.getValue());
		}
		
		
		
		

	}

}
