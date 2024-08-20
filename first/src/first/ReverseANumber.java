package first;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=64;
		//for 2 digits
		
		int r=num % 10;  //2
		int x=r*10; //20
		int q=num/10; //3
		
		System.out.println(x+q);
		
		
		int num1=1234;
		int rev=0;
		
		while(num1!=0) {
			rev= rev *10 + num1%10;    //4    //40+
			num1=num1/10;   			 //6
		}
		
		System.out.println(rev);
		
		
		int num2=1234;
		StringBuffer rev1;
		StringBuffer s= new StringBuffer(String.valueOf(num2));//number to string
		rev1=s.reverse();
		System.out.println(rev1);
		
		

	}

}
