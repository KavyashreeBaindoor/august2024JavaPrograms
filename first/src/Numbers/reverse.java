//Write a function to reverse a number in Java.


package Numbers;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//9876  ---- 6789
		
		int num=9876;
		int rev=0;
		
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		
System.out.println(rev);
		
		
		

	}

}
