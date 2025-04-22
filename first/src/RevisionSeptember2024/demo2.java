package RevisionSeptember2024;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kavya12shre3e  --------------------- 1+2+3 =6
		
		String a="kavya12sh31ree";
		String num="";
		int sum=0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>47 && a.charAt(i)<58) {
				num+=a.charAt(i);
			}
		}
		
		System.out.println(num);
		
		for(int i=0;i<num.length();i++) {
			 sum+= Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		
		System.out.println(sum);
	}

}
