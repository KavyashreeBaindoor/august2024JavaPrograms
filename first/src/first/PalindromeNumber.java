package first;

import java.util.Arrays;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=123876;
		int rev=0;
		int rem;
		while(no>0) {
			rem=no%10;
			rev=rev*10+rem;//3//32
			no=no/10;//12
			
		}
		
		System.out.println(rev);
		
		

}}
