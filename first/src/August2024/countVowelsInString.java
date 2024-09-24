package August2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countVowelsInString {

	public static void main(String[] args) {
	//  String.contains("only one character it checks so went for AL")
		
		String a="kavyashree";  
		String b="aeiou";
		int count=0;
		
		String[] vowel=b.split("");
		String[] input=a.split("");
		
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(vowel));
		
		for(int i=0;i<input.length;i++) {
		if(al.contains(input[i]))
				count++;
		}
		
		System.out.println(count);
		
		way2();
		way3();
		way4();
	}

	
	
public static void way2() {
		
		String a="kavyashree";
		int count=0;
		
		Pattern p = Pattern.compile("[aeiouAEIOU]");
		Matcher matcher=p.matcher(a);
		
		for(int i=0;i<a.length();i++) {
		if(matcher.find()) 
	        count++;
	      }
	System.out.println(count);
		
	}


public static void way3() {
	
	String a="kavyashree";
	int count=0;
	char[] arr=a.toCharArray();
	
	for(char c:arr) {
		if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
			count++;
	}
	
	
	System.out.println(count);
	
}

public static void way4() {
	
	String a="kavyashree";
	
	
int count=	a.length()-a.replaceAll("['aeiouAEIOU']", "").length();
	
	System.out.println(count);
	
}

}
