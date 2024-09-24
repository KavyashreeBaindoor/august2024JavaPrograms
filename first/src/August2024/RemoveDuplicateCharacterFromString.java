package August2024;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="goodmorning";    //god
		String res="";
		
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(a.indexOf(c, i+1)==-1){
				res+=c;
			}
			
}
		  
		System.out.println(res);	

	}

}
