package August2024;

public class FindingLengthOFStringwithoutLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="kavya";
		
		
		char[] arr=name.toCharArray();
		int count=0;
		
		
		for(char c:arr) {
			count++;
		}	
		System.out.println(count);
		
		
		//iterate through string
		
		for(int i=0;i<name.length();i++) {
			
			System.out.println(name.charAt(i));
			
			
		}
		
		
		
		
	}

}
