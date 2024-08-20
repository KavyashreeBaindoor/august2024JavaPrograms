package InterviewStrings;

import java.util.Arrays;
import java.util.HashMap;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="kaka";
	
		StringBuffer sb = new StringBuffer();
	//	sb.append(a);
		int idx;
		
		for(int i=0;i<a.length();i++) {
			 char c = a.charAt(i); //k
			 idx = a.indexOf(c, i + 1);
			 if (idx == -1) {
			        sb.append(c);
			    }
		}
		
		
	System.out.println(sb);		
		
		
		
		
	}

}
