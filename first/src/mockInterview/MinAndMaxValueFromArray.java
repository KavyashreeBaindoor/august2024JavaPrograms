package mockInterview;

import java.util.Arrays;

public class MinAndMaxValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		way1(new int[] {100,90,45,2});
		//way2(new int[] {100,90,45,2});

	}
	
	public static void way1(int[] arr) {
		
		Arrays.sort(arr);
		
		System.out.println("min value is "+arr[0]+" and max value is  "+arr[arr.length-1]);
		
		
	}
	

	public static void way2(int[] arr) {
		
		int max=0;
		int min=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			min=arr[0];
			if(arr[i]<min){
				min=arr[i];
			}
		}
		
		System.out.println(max+"    "+min);
		
		
		
	}

}
