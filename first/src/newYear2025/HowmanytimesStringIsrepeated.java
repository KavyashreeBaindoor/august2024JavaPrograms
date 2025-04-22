package newYear2025;

public class HowmanytimesStringIsrepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//le --how many tyms repeated
		
		String a="lekhalele";
		int count=0;
		
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='l' && a.charAt(i+1)=='e') {
				count++;
			}
			
			
		}
		
		
		System.out.println(count);
		
		

	}

}
