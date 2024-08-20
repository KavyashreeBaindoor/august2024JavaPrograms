package first;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int A=10;
		//java is case sensitive
		System.out.println(a+"****"+A);//10****10
		
		//exceptions in namings
		//all java predefined class names and interfaces ok, not recommended
		int String=78;
		System.out.println(String);//78
		int Runnable=77;
		System.out.println(Runnable);//77
		
		
		//////////////////////////////////
		//datatypes
		//strongly typed
	byte b=127;
	System.out.println(b);
	
	//byte b1=128;////cannot convert from int to byte
	//System.out.println(b1);//cannot convert from int to byte
	byte b10=(byte) 128;
	System.out.println(b10);//-128
	
	byte b3=-127;
	System.out.println(b3);	//-127
	//byte b=true;//cannot convert from boolean to byte

	//int b4=9090909090;//The literal 9090909090 of type int is out of range 
	long b5=8989898989l;
	System.out.println(b5);
	
	//char b6=null;//cannot convert from null to char
	//System.out.println(b6);
	//null is not related to primitives
	
	

	
	
	float b7=1256;
	System.out.println(b7);//1256.0
	
	float b8=(float) 9999999999.0;
	System.out.println(b8);
	
	double b9=9999999999.0;
	System.out.println(b9);
	
	//implicit typecasting by jvm
	
	char b11=97;
	System.out.println(b11);//a
	
	byte b12=10;
	b12++;
		
	//////////////////////////
	//int c1,c2,c3=10,20,90;
	int c1=10;
	float c2=19.8989f;
	int res=(int) (c1+c2);
	float res1=c1+c2;
	System.out.println(res+"  "+res1);//29  29.8989
	
	byte c3=10;
	byte c4=10;
	//explicit typecasting
	byte c5=(byte) (c3+c4);
	int c6=c3+c4;
	java.lang.System.out.println(c5+"  "+c6);//20  20
	
	///nan
System.out.println(java.lang.Double.NaN);//nan
System.out.println(java.lang.Float.NaN);//nan
System.out.println(1.0 / 0.0);

//relational operators

//System.out.println("abc">"abc");
//The operator > is undefined for the argument type(s) of object type
System.out.println('a'>'a');//false
//System.out.println(10<20<30);//true<30
//he operator < is undefined for the argument type(s) boolean, int

System.out.println(null==null);//true
String s1=null;
String s2=null;
System.out.println(s1==s2);//true
System.out.println(s1==null);//true

Practise p=new Practise();
System.out.println(p instanceof Practise);//true

int p1,p2,p3,p4;
p1=p2=p3=p4=10;


//variables





	}

}
