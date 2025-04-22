package RevisionSeptember2024;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="kavya";
		String rev="";
		
		for(int i=1;i<=a.length();i++) {
			rev+=a.charAt(a.length()-i);
		}
		
		System.out.println(rev);
		

	}

}
