package August2024;

public class checIfS2isRotatedversionOfS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="kavya";
		String b="ayvak";
		
		int j=1;
		boolean flag=true;
		
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) != b.charAt(b.length()-j)) {
				flag=false;
				break;
			}
			else
				j++;	
		}
		
		
		
		if(flag) 
			System.out.println("yes it is");
		else
			System.out.println("no");
		
		

	}

}
