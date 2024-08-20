package first;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
	Student s2=new Student(new Teacher());
	System.out.println(s2.toString());
	
	
	
}
	 void message() {
		System.out.println("message nice");
	}
}

class Student{
	String name;
	
	Student(Teacher obj){
		this.name=obj.name;
	}
	
	@Override
	 public String toString(){
	 return "Student[name="+name+"]";
	 }
	}

class Teacher{
	String name="kavya";
}
	

