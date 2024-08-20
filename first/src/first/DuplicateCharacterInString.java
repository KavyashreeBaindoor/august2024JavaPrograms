package first;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		//this is simple one if u want output like a:1;t:1;o:1 use hashmap
		// TODO Auto-generated method stub
		String a="Automation";
		String b=a.toLowerCase();
		int count=0;
	    char[] ch=b.toCharArray();
		
	for(int i=0;i<ch.length;i++){
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				System.out.println("repeated char"+" "+ ch[i]);
				count++;
			
			}
		}
	}
		
	System.out.println(count);			
	}

}
