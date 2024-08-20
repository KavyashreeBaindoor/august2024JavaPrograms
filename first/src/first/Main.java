package first;

public class Main {
	
	 
	 
	 public static void main(String args[]) {
	  
	   }
}


 class Box {
	int l;int w;int h;
	
	Box(){
	   this.l=1;
	   this.w=2;
	   this.h=3;
   }
	
	public void message() {
		System.out.println("hey");
	}
	
	public void kavya() {
		System.out.println("hey kavayyayaya");
	}
   }
 
class child extends Box{
	int weight;
	child(int w){
		this.weight=w;
	}	
	public void message() {
		System.out.println("hey i am child");
	}
	public void greet() {
		System.out.println("i am kavya");
	}
}
 
 	
