package Array;

public class PairOfElementWhoseSumisEqualToGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		int[] arr= {3,2,4,7,-1,3};
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==n)
					System.out.println("pair of elemenets :"+  arr[i]+"    "+arr[j]);
	
			}		
		}

	}

}
