package Array;

import org.w3c.dom.ranges.RangeException;

public class Trough {

	//private Exception new RuntimeException();;



	void m1() 
	{
		
		
		try {
			
		//	throw new Exception();
			
			throw new ArithmeticException();// inheritance rule apply
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			// TODO: handle finally clause
	System.out.println("hello  i am finaly");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		new Trough().m1();
		
		System.out.println("main");
	}

}
