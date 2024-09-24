package Array;

public class findMinInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,-9,8,-7,-88};
		
		int min=arr[0];
		
		
		for(int k:arr) {
			if(k<min)
				min=k;	
		}
		
		
		System.out.println(min);
		
		
		
		
	}

}
