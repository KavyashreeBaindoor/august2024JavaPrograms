package mockInterview;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vowelsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//exact match  welcome =welcome
		String a="welcome";
		
		Pattern p=Pattern.compile("welcome");
		Matcher m=p.matcher(a);
			boolean b=m.matches();
			
			if(b) 
				System.out.println("excat match");
			else 
				System.out.println("not");
			
			
	///////////////////////////////////////////////		
			String d="welcomeeee";
			
		
		Pattern p1=	Pattern.compile("[aeiouAEIOU]");
		Matcher m1=p1.matcher(d);
		
		if(m1.find()) 
		{
			
			System.out.println("vowel present");
		}
		else {
			System.out.println("not present");
		}
		
		
//total no of vowels present
		
		String k="welcomeee";
		String[] l=k.split("");
		int count=0;
		
		for(int i=0;i<l.length;i++) {
			
			if(l[i].contains("a")||l[i].contains("e")||l[i].contains("i")
		||l[i].contains("o")||l[i].contains("u")) {
	count+=1;
	continue;
}		
			
}
		
System.out.println(count);		
	
		
		
		
		
		
		
		
		

	}

}
