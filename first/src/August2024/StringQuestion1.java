package August2024;

import java.util.Arrays;

public class StringQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="kavya";
		String b="nobit";    
		String res="";
		
		
		char[] a1=a.toCharArray();
		//System.out.println(Arrays.toString(a1));//[k, a, v]
		
		char[] b1=b.toCharArray();  //[s,h,r]
		
		
		char[] arr = new char[a1.length+b1.length];
		int count=0;   //final result array length maintenance
		int j=0; 
		
		
		
	
		for(int i=0;i<a1.length;i++) {
			
			arr[count]=a1[i];    
			
			 count++;      
		
			for(;i<b1.length;) {
				arr[count]=b1[j]; 
				count++;
				break;
				
			
				
			}
			
			j++;
		}
		
		
	
		
		System.out.println(Arrays.toString(arr));
		
		res=new String(arr);
		System.out.println(res);
		
		Way2(a,b);
		
		
	}
	
	
	public static void Way2(String a,String b) {
		
		
		for(int i=0;i<a.length();i++) {
		System.out.print(a.charAt(i)+""+b.charAt(i));
		}
		
	}

}
