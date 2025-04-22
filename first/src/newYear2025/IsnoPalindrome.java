package newYear2025;

public class IsnoPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=565;
		int originalNumber=num;
		int rev=0;
		int singleDigit;
		
		while(num>0) {
			
			singleDigit=num%10;  
			rev=rev*10+singleDigit;  
			num=num/10; 
				
		}
		
		System.out.println(rev);
		
		if(rev==originalNumber) {
			System.out.println("it is palindrome");
		}
		
		

	}

}
