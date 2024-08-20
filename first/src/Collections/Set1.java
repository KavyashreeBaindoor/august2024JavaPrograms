package Collections;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.*; 

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating an set
	    Set<String> languages = new HashSet<>();
	    languages.add("Java");
	    languages.add("JavaScript");
	    languages.add("Python");
	    
	    System.out.println(languages);

	    // Using forEach loop
	  
	  Iterator<String> i=languages.iterator();
	   System.out.println(i.next());
	   
	   while(i.hasNext()){
	       System.out.println(i.next());
	   }
	  
	  
	  
	    for(String language : languages) {
	      System.out.println(language);
	 
	    }
	    
	    languages.forEach(s->System.out.println(s));
	    
	    
	    ///set to array
	    int n=languages.size();
	    String[] arr =new String[n];
	    languages.toArray(arr);
	    
	    //display array
	    System.out.println(Arrays.toString(arr)); 
	  }

	

}
