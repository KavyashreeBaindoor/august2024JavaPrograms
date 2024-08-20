package mockInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeduplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//[1,3,4,1,3,6,7] ----  [1,3,4,6,7]
		way1(new int[] {1,3,4,1,3,6,7});
		way2(new int[] {1,3,4,1,3,6,7});
		

	}
	
	
	public static void way1(int[] arr) {
		
		
		
		Set<Integer> s=new HashSet<Integer>();
		for(int a:arr) {
		s.add(a);		
}
		
		System.out.println(s);
		
	}
	
public static void way2(int[] arr) {
		
	List<Integer> l=new ArrayList<Integer>();
	
	for(int a:arr) {
		
		if(l.contains(a)) {
			continue;
		}else
		{
			l.add(a);
		}
		
		
	}
	
	System.out.println(l);
	
		
		
		
	}

}
