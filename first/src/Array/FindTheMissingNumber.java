package Array;

public class FindTheMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5,6,7,9};
		int sum=0;
		int expectedSum=0;
		
		
		for(int a:arr) {
			sum+=a;
		}
			
		for(int i=1;i<=arr.length+1;i++) {
			expectedSum+=i;
		}
		
	
		
		System.out.println("missig number is:"+ (expectedSum-sum));
		

	}

}
