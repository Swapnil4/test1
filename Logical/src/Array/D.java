package Array;

public class D extends C {


	
	/*static {  // we cannot throws excepcetion here 
		

//		C	c1=new C();
		     
		  D d = null ;//if you do not  pass null
		try {
			d = new D();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  
	try {
		C c=	  (C) d.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	
*/	void m2()
	{}
	
	// 
	
	D() throws CloneNotSupportedException // we can throws keyword with constructor
	{
	//C	c11=new C();
	     
	  D d=new D();
	  
C c13=	  (C) d.clone();
	}
	
	
	 void p() throws CloneNotSupportedException //here we pass the throws with method
	{

		//C	c111=new C();
		     
		  D d=new D();
		  
	C c=	  (C) d.clone();

		
	}
	 
/*	 interface i  throws ArithmeticException  // we can not throws keyword with interface
	 {
		 
		 
	 }
	 
*/	
	
	public static void main(String[] args) throws ArithmeticException // we can throws keywoe of static method also
	
	
	{
			//C o=  (C) d.clone();
	  
		
	  
	}
}
