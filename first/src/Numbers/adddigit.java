package Numbers;

public class adddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=99;
		int singleDigit=0;
		int sum=0;
		
		
		while(num>0) {
			singleDigit=num%10; //
			
			System.out.println(num);
			sum+=singleDigit;
			num=num/10;
			
		}
		
		System.out.println(sum);

	}

}
