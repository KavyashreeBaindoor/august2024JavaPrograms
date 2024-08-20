package Numbers;

public class prime {
	
	static int num=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(Prime(num));	

}

	
	
	
	public static  boolean Prime(int num) {
		if (num==1)
			return true;
		
		for(int i=2;i<num-1;i++) {
			if(num%i==0) 
				return false;
			}
		
		return true;
		
		
	}
	}