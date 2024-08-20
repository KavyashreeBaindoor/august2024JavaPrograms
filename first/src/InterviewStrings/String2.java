package InterviewStrings;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="kavyashreebaindoor";
		char[] b=a.toCharArray(); //['k','a',...]
		String rev="";
		
		for(int i=1;i<=b.length;i++) {
			rev=rev+b[b.length-i];
		}
		
		System.out.println(rev);
		
		
		
		//or 
		
		
		String k="kavyashreedeepashree";
		StringBuffer k1=new StringBuffer(k);
		System.out.println(k1.reverse());
	}

}
