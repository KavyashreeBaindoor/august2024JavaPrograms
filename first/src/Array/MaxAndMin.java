package Array;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxAndMin {
	
	static int max;
	static int min;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max=0;
		 int min;
		int[] arr= new int[] {1,10,78,100,-1,100000};
		min=arr[0];

	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
			
		}
			
			
		
			
			System.out.println(min+" "+max);
			
		
			//array to list  (boxed---primitive to object type)
			
	            List<Integer> l = Arrays.stream(arr).boxed().toList();
	            min=Collections.min(l);
	            max=Collections.max(l);
	            
	            System.out.println(min+"     "+max);
	            
	            
	            //sort method
	            
	            Arrays.sort(arr);  //changes original array itself
	            
	            System.out.println(arr[0]+" sort method    "+arr[arr.length-1]);
			
		
		}
	
	
	

	}


