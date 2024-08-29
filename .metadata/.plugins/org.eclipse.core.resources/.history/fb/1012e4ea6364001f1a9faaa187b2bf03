package August2024;

public class parseIntFromStringAndAddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="22kavya8";   // --- 12
		
		
		
		char[] arr=a.toCharArray();
		String intval="";
		
		for(int i=0;i<arr.length;i++) {
			
			if(Character.isDigit(arr[i]))
				intval+=arr[i];
			else
				continue;
		}
	
		
		
		//System.out.println(intval); --"128"
		
		int c=Integer.parseInt(intval); //128
		int sum=0;
		
		while(c>0) {
			
			int digit=c%10 ;  //8
			sum+=digit;
			c=c/10;
			
		}
		
		System.out.println(sum);
		
		
		

	}

}
