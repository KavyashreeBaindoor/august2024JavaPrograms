package first;

public class variablesPractice {
    int x;
	static int y;
	
	public static void main(String[] args) {
		
		variablesPractice a=new variablesPractice ();
		System.out.println(a.x);
	System.out.println(a.y);
		a.m1();
		
		
		//System.out.println(x);
		//Cannot make a static reference to the non-static field x
		System.out.println(y);
	}
	
public void m1() {
	int z=10;
	System.out.println(x);
	System.out.println(variablesPractice.y);
	
//	*
//	**
//	***
//	****
	
	
	for(int i=0;i<4;i++) {
		for(int j=0;j<i+1;j++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	

	/*  * 
	   * * 
	  * * * 
	 * * * *    */
	
	for(int i=1;i<=4;i++) {
		for(int j=4;j>i;j--) {
			System.out.print(" ");
		}
		
		for(int j=1;j<=i;j++) {
		System.out.print("* ");
		}
		
		System.out.println();
	}
	
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
	

}

}
