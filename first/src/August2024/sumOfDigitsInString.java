package August2024;

public class sumOfDigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="kavya123shree";
		
		String b="";
		
		
		//taking number out of string
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>=48 && a.charAt(i)<=57)
			b+=a.charAt(i);	
		}
		
		
	
	int num=Integer.parseInt(b);
	int sum=0;
		
	
	while(num>0) {
		int digit=num%10;  //3
		sum+=digit;
		num=num/10;
		
	}
		
System.out.println(sum);
	}

}
