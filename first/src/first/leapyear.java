package first;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scanner = new Scanner(System.in);
		   int in = scanner.nextInt();
		   
		   Boolean flag=false;
		   
		   if(in%4 ==0 ) {
			   if(in %100 ==0) {
				   if(in%400 ==0) {
					   flag=true;
				   }
				   
				   flag=true;
			   }else 
				   flag=false;
			  
			 
			   
			   if(flag=true) {
				   System.out.println("it is leap year");
			   } if(flag=false){
				   System.out.println("it is not leap year");
			   }
			   
			   
			   
			   
		   }
		    

	}

}
