package InterviewStrings;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a=new String("kavya");
		a="navya";
		System.out.println(a); //navya
		
		String b="kavya";
		String c="kavya";
		
System.out.println(a==b);//false
System.out.println(c==b);//true

String k=new String();
k="bhavabna";
System.out.println(k);//bhavabna

char[] ch= {'k','a','j','d'};
String m=new String(ch);

System.out.println(m);//kajd





	}

}
