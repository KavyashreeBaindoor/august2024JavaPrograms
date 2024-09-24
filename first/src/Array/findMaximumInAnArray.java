package Array;

public class findMaximumInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[] arr= {1,78,2,4,5};
		int max=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max)
				max=arr[i];
				
		}
		
		
		System.out.println(max);
		
		

	}

}
