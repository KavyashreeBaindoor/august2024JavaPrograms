package Array;

import java.util.Arrays;

public class secondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,50,76,12};
		
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);
		
		
	}
}
