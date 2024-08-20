//Write code to filter duplicate elements from an array and print as a list.

package Array;

import java.util.ArrayList;

public class one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[1,4,5,1,3,5]  ----  [1,4,5,3]
		
		Integer[] arr= {1,5,1,5,6,5,5,5,0,9};
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(a.contains(arr[i])) {
				continue;
			}
			else {
				a.add(arr[i]);
				
			}
		}
		
		System.out.println(a);
		
	}

}
