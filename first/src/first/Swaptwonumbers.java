package first;

public class Swaptwonumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//1
		a=a+b;  //30
		b=a-b;  //10
		a=a-b;   //20
		
		System.out.println(a+"   "+b);
		
		//2
		//should not contain "0"
		b=b/a;   //2
		a=a*b;   //20
		b=a/b;  //10
		
		System.out.println(a+"   "+b);
		
		
		//3
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+"   "+b);
		
		
		
		
		
		
		
		

	}
	
	

}
