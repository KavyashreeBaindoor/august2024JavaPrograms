package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,10,30,30,60,60,80,80};
			
		//sorting
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==arr[i+1])
				
				System.out.println("duplicate element   "+ arr[i]);
			
			
		}
		

		
	
	}

}
