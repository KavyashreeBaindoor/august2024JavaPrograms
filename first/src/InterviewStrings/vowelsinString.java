package InterviewStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.*;  

public class vowelsinString {

	public static void main(String[] args) {
	way2();
	way1();
	
		
		}
	
	
	public static void way1() {
		
		String a="deepashree";
		
		Pattern p = Pattern.compile("[aeiouAEIOU]");
		Matcher matcher=p.matcher(a);
		if(matcher.find()) {
	         System.out.println("The input string contains vowels");
	      } else {
	         System.out.println("The input string does not contain vowels");
	      }
			
		
		
	}
	
	

		
		
		
		
		
		
	
	
	
	
	
	
	
public static void way2() {
	String a="kykyky";
	
	String[] input =a.split("");
	
String b="aeiou";
String[] vowel=b.split("");
List<String> l=new ArrayList<String>(Arrays.asList(vowel));
boolean res = false;



for(int i=0;i<input.length;i++) {

	if(l.contains(input[i])) {
		res=true;
		break;
		
	}
	
}
	
System.out.println(res);

}




}
