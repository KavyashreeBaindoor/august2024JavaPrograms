package August2024;

public class checkEqualityOfTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="abc";
		String b="def";
		boolean flag=true;
		
		
		 for(int i=0;i<a.length();i++) {
			 if(a.length()==b.length()) {
			if(b.indexOf(a.charAt(i))==-1)
				flag=false;
			break;	
		}}
		 
		
	    if(flag)
			System.out.println("strings are equal");
		else
			System.out.println("not equal");
		

	}

}
