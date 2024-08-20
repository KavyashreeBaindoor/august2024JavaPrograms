package InterviewStrings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countNumberOfVowelsInString();
		vowelpresentinStringOrnot();
		vowelpresentinStringOrnotUsingPatternClass();

	}
	
	public static void countNumberOfVowelsInString()
	{
		
		String a="Kavyashreeaa";
		
		int count=0;
		
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i)=='a' || a.charAt(i)=='e'||a.charAt(i)=='i' 
					||a.charAt(i)=='o' ||a.charAt(i)=='u') {
				count+=1;
			}
		}
		
		System.out.println(count);
		
	}
	
	
	public static void vowelpresentinStringOrnot() {
		String a="kkkk";
		String vowel="aeiou";
		String[] b=vowel.split("");
		boolean flag=false;
		
		for(int i=0;i<b.length;i++) {
			
			if(a.contains(b[i])) {
				flag=true;
				break;
			}
			
			
		}
		
		System.out.println(flag);
		
		
	}
	
	
	public static void vowelpresentinStringOrnotUsingPatternClass() {
		String a="kkk";
		Pattern p=Pattern.compile("[aeiouAEIOU]");
		Matcher matcher=p.matcher(a);
		if(matcher.find()) {
	         System.out.println("The input string contains vowels");
	      } else {
	         System.out.println("The input string does not contain vowels");
	      }
	}
}
