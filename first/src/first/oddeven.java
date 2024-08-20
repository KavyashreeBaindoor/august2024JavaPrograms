

package first;
import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		//System.out.println(no);
		OddEven(no);
		}
	
	public static void OddEven(int no) {
		if(no%2==0)
			System.out.println("it is even");
		else
			System.out.println("not even");
		
	}

}
