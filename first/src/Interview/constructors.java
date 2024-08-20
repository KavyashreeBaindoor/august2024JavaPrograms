package Interview;

public class constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(89,"navya");
		a.m1();
		A b=new A("kavya");
		b.m1();
		A c=new A("kavya",90);
		c.m1();

	}

}


class A{
	int rollno;
	String name;
	int marks;
	
	/*
	 * A(){ this.rollno=25; this.name="kavya"; }
	 */
	
	A(int r,String n){
		//super();  --firsdt line always super() even if not written
		this.rollno=r;
		this.name=n;
	}
	
	A(String n){
		this.name=n;
	}
	

	A(String n,int m){
		this.name=n;
		this.marks=m;
	}
	
	public void m1() {
		System.out.println(rollno+" "+name+" "+marks);
	}
	
}
