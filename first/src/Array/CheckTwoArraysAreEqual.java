package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckTwoArraysAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4};
		int[] b= {1,2,3,4};
		boolean flag=true;
		
		if(a.length!=b.length) {
			flag=false;
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i])
				flag=false;
		}	
		
		if(flag)
			System.out.println("are equal");
		else
			System.out.println("not");
		

	}

}
