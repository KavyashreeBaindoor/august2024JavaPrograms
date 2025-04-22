package RevisionSeptember2024;

public class SwaptheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="kavya";
		String s2="deepa";
		
		
		s1=s1+s2;   // "kavyadeepa"
		
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s1.length()-s2.length());
		
		
		System.out.println(s1+"        "+s2);
		
		
		
		
		
		
	}

}
