package newYear2025;

public class IsNumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int no=569;
		
		//converted no to string
		String a=Integer.toString(no);
		
		//string to SB
		StringBuilder b= new StringBuilder(a);
		StringBuilder rev=b.reverse();
		
		String rev1=rev.toString();//convert sb to string
	
		
		if(a.equals(rev1))System.out.println("palindrome");
		else System.out.println("not palin");
		
		
		
		
		

	}

}
