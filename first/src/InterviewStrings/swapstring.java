package InterviewStrings;

public class swapstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swap string without using 3rd variable
		
		String s1="kavya";
		String s2="shree";
		
		
		System.out.println(s1+"  "+s2);
		
		s1=s1+s2;
		
		
		s2=s1.substring(0,s1.length()-s2.length());
		
		
		s1=s1.substring(s2.length());
		
		System.out.println(s1+"   "+s2);
		
		
		
		//kavya.shree  ----  shree.kavya
		
		String s4="kavya.shree";
		
		String s5=s4.substring(6,s4.length());
		String s7=s4.substring(5,6);
		String s6=s4.substring(0,5);
		
		s4=s5+s7+s6;
		System.out.println(s4);
		
		

	}

}
