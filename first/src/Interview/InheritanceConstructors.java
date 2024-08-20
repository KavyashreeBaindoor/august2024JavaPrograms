package Interview;

public class InheritanceConstructors {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a=new B("navya",89,99);
		a.m1();
		
		C c=new C("rns","kavya",98,1);
		c.m1();
		

	}

}


class B{
	int rollno;
	String name;
	int marks;
	
	B(String n,int m,int no){
		this.name=n;
		this.marks=m;
		this.rollno=no;
	}
	
	public void m1() {
		System.out.println(rollno+" "+name+" "+marks);
	}
	
}

class C extends B{
	
	String college;
	
	C(String c,String name,int m,int r){
		super(name,m,r);
		this.college=c;
		
	}
	
	public void m1() {
		System.out.println(rollno+" "+name+" "+marks+" "+college);
	}
	
}



//same class name not allowed within one package
//constructors arguments should be sent in the same order
//super is very important --- code re-usability
