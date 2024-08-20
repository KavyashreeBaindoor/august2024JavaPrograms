package first;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="123456789";
		char rev;
	    int j=a.length()-1;
		String finalres = "";
	
	
		//string cant be accesed like a[0],a[1]
		//my way 
		for(int i=0;i<a.length();i++) {
			
			rev=a.charAt(j);
		//string with string concat --then every tym a new object craeted
		//string ---add char like in 22 using +
			finalres=finalres+rev;
			j--;
			
			
		}
		//copied way
		
		String original="kavya";
		int length=original.length();
		String rev1="";
		
		for(int i=length-1;i>=0;i--) {
			
			rev1=rev1+original.charAt(i);
		}
		
		//using sbuffer reverse function
		
		StringBuffer b=new StringBuffer(a);
		b.reverse();
		
		
		System.out.println(b.toString());//using rev of sb
		System.out.println(finalres);//string
		System.out.println(rev1);
	
	}

}
