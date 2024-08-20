package Interview;




	public class Inheritance {
		 public static void main(String args[]) {
		      
		   
		      Box b2=new Box(10,90,87);
		      System.out.println(b2.l);//1
		      child c=new child(56,90,99,87);
		      System.out.println(c.l); //1
		      Box b1=new child(98,9,9,8);
		    //  System.out.println(b1.weight); //error
		      System.out.println(b1.l);
		      
		      Box b4=new child(98,9,9,8);
		      b4.overload();
		      
		    }	}
	
	
class Box {
		
		int l;
		int w;
	    int h;
	    
	public Box(int l, int w, int h) {
		super();
		this.l = l;
		this.w = w;
		this.h = h;
	}
	
	
	public void overload() {
		System.out.println("this is parent overloaded method");
	}
	
 }
	
	
class child extends Box{
	int weight;
	child(int w,int l,int wi,int h){
		super(l,wi,h);
		this.weight=w;
	}
	
	
	public void overload(int m) {
		System.out.println("this is child overloaded method");
	}
}