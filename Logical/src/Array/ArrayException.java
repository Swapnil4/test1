package Array;



public class ArrayException {
	
	
	
	/*@Override
	public String toString() {
		return 
				
	}
*/
	public static void main(String[] args) {
		
		ArrayException  ab=new ArrayException();
		
		
		/*Object[] stringArray = new String[5];   //No compile time error : String[] is auto-upcasted to Object[]
        
        stringArray[1] = "JAVA";  
               
         
       // System.out.println(stringArray[1]);
       stringArray[2] = 100;     //No compile time error, but this statement will throw java.lang.ArrayStoreException at run time
         
        //because we are inserting integer element into an array of strings
*/	
		
	//==========================second prog=======================
		
		 //Creating anonymous arrays
		  
        System.out.println(new int[]{1, 2, 3, 4, 5}.length);    //Output : 5
  
        System.out.println(new int[]{21, 14, 65, 24, 21}[1]);   //Output : 14
	
       // System.out.println(new int[][1]{21, 14, 65, 24, 21});   //Output : error
        
        
        
        System.out.println(new int[]{21, 14, 65, 24, 21});   //Output : get hashcode
    	 
        System.out.println();
	//==========================third prog========================
	
        int[] a = new int[10];
        
        int[] b = new int[100];
         
        a = b;     
        
        System.out.println(a.length); // output : 100
        
        String hg[]= {"abc"};
        String hg1[]= {"abcdf"};
        
        hg=hg1;
        
        System.out.println();
        
        
        
        
       
	
	
	}

	//=======================method withen method implementation not possible  only calling possible 
	
	/*void m1()
	{
		
		void m2()
		{
			System.out.println("hello"); 
		}
	}
	
	*/
	
	
	
	
	
}
