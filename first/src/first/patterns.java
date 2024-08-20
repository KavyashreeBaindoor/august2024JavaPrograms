package first;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		**
		***
		****/
		for(int i=0;i<4;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		 /* *
		   **
		  ***
		 ****  */
		
		for(int i=1;i<=4;i++) {
		    for(int j=4;j>i;j--) {
				System.out.print(" ");
				}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();	
			
		}
		
		//3
		
		/*  * 
		   * * 
		  * * * 
		 * * * *    */
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			if(i==2) {
				System.out.print(" ");
				System.out.print("*");
			}
			if(i==3) {
				System.out.print(" ");
				System.out.print("*");
				System.out.print(" ");
				System.out.print("*");
			}
			if(i==4) {
				System.out.print(" ");
				System.out.print("*");
				System.out.print(" ");
				System.out.print("*");
				System.out.print(" ");
				System.out.print("*");
			}
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//one more way---best way for 3rd question
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
			System.out.println();
		}
		
		//4
		
	/*	1
		12
		123
		1234   */
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
	System.out.println();
		}
		System.out.println("&&&&&&&&&");
		
	//5th 
		
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//6th
		for(int i=65;i<=68;i++) {
			for(int j=65;j>=i;j++) {
				System.out.println((char)j);
			}
			System.out.println();
		}
		
		
		
	}

}
