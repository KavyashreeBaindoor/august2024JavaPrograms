package August2024;

public class addDigitisInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=64;
		int sum=0;
		int num1;
		
		
		while(num>0) {
		 num1=num%10;  // 4
		sum+=num1;
		num= num/10;  //6
		
		
		}
		
		System.out.println(sum);
	}

}
