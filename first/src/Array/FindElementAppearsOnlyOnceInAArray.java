package Array;

public class FindElementAppearsOnlyOnceInAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {1,2,2,5,1,5,6};
		int count=1;
		
		for(int i=0;i<arr.length;i++) {
			count=1;
			
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j])
				count++;	
			}
			
			
			if(count==1)
				System.out.println(arr[i]);
				}
		
		
	
	
		

	}

}
