package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

	
	int rollno;
    String name, address;
 
    // Constructor
    public Student(int rollno, String name,
                               String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.address;
    }
	public static void main(String[] args) {
		 ArrayList<Student> ar = new ArrayList<Student>();
	        ar.add(new Student(123, "pppp", "pune"));
	        ar.add(new Student(131, "aaaa", "nyc"));
	        ar.add(new Student(121, "cccc", "jaipur"));
	 
	        System.out.println("Unsorted");
	        //Collections.sort( ar);
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	        
	        Collections.sort(ar, new Sortbyname());
	        
	        System.out.println(ar);
	        for (int i=0; i<ar.size(); i++)
	            System.out.println(ar.get(i));
	        

	        
	       
	}
}
