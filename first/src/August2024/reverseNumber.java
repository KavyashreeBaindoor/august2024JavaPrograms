package August2024;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=98;             //89
		int rev=0;
		
		
		while(n>0) {
		
			rev=rev*10+n%10;  // 8
			n=n/10;   //9
		
		}
		
		System.out.println(rev);

	}

}
