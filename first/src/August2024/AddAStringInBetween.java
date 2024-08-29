package August2024;

import java.util.ArrayList;

public class AddAStringInBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//kavya  ----  kav123ya
		
		String a="kavya";
		
		
		//1 way
		
		StringBuilder b=new StringBuilder(a);
		b.insert(3, "123");
		
		System.out.println(b);
		
		
		//2nd way
		
		
	System.out.println(stringInsert("123456", 3, a));	
		
		
		
		

	}
	
	public static String stringInsert(String k,int index,String a) {
		String start=a.substring(0,index);
		String end=a.substring(index);
		return start+k+end;
		
	}

}
