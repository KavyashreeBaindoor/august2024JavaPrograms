package first;

import java.util.Scanner;

public class greatestOfThreeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		//Greater(a,b,c);
		Greater1(a,b,c);
	}
	
	public static void Greater(int a,int b,int c) {
            int grt=0;
		
		if(a>b)
			grt=a;
		else 
			grt=b;
		if(grt>c) {
			System.out.println("the greatest number is"+ grt);
		}else
		{
			System.out.println("the greatest number is"+ c);
		}
		
	}
	
	public static void Greater1(int a,int b,int c) {
     if(a>b & a>c) 
     {
    	 System.out.println("the greatest number is"+ a);
     }
     else if(b>a & b>c) 
     {
    	 System.out.println("the greatest number is"+ b);
}
     else
{
	 System.out.println("the greatest number is"+ c);
}
	
}

}
