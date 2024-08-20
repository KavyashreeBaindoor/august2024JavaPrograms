package InterviewStrings;

public class countuppercaseaAndLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="KAVyaShree";
		
		int upper=0;
		int lower=0;
		
		for(int i=0;i<a.length();i++) {
			
			char b=a.charAt(i);
			//65-90  A-Z
			if(b>=65 && b<=90)
				upper+=1;
			
			//97 to 122
			else
				lower+=1;
			
			
		}
		
		System.out.println("upper is"+upper+"   "+lower);
		
		

	}

}
