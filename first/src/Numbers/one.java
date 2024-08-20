//Q #3) Write a Java Program to swap two numbers using the third variable.
//4) Write a Java Program to swap two numbers without using the third variable.

package Numbers;



public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=90;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+"  "+b);
		without(a, b);

	}
	
	public static void without(int a,int b) {
		a=a+b;//100
		b=a-b;//10
		a=a-b;//90
		System.out.println(a+"  "+b);
		
		
	}

}
