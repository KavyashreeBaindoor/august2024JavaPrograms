package August2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;

public class reverseAStrinng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="kavyashreee";
		
		
		
		StringBuilder b=new StringBuilder(a);
		b.reverse();
		System.out.println(b);
		System.out.println(a);
		
		
		
		//2nd way
		String[] arr=a.split("");
		String rev="";
		//System.out.println(Arrays.toString(arr));//[k, a, v, y, a, s, h, r, e, e]

		
		for(int i=arr.length;i>0;i--) {
			rev+=arr[i-1];
		}
		
		System.out.println(rev);
		
		
		
		//3rd way  --can add characters to string
		
		char ch;
		String rev1="";
		
		for(int i=a.length();i>0;i--) {
			rev1+=a.charAt(i-1);	
		}
		
		
		System.out.println(rev1+"  " +"third way");
		
		
		
		//4th way ---swapping
		
		char[] k=a.toCharArray();
		
		int start=0;
		int end=k.length-1;
		
		
		for(int i=0;i<k.length/2;i++) {
			
			char temp=k[start];
			k[start]=k[end];
			k[end]=temp;
			
			end--;
			start++;	
		}
		
		//System.out.println(Arrays.toString(k));//[e, e, e, r, h, s, a, y, v, a, k]
		
		String rev5="";
		
		for(char a2:k) {
			rev5+=a2;
		}
		
		System.out.println(rev5);
		
		
		//5th way --- arraylist
		
		char[] arr2=a.toCharArray();
		ArrayList<Character> al=new ArrayList<Character>();
		
		
		for(int i=0;i<arr2.length;i++) {
			al.add(arr2[i]);
		}
		
		Collections.reverse(al);
		
		//System.out.println(al); //[e, e, e, r, h, s, a, y, v, a, k]
		
		String rev3="";
		
		for(char c:al) {
			rev3+=c;
		}
		
		System.out.println(rev3);
		
		
		//6thway  --- xor
		
		

	}

}
