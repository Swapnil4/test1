package Array;

public class B {
	
/*	
	public void printStuff() {
		super.printStuff();
		System.out.println("Class B");
	}

	
	*/

	public static void foo() {
		try {
		throw new RuntimeException();
		}finally {
			System.out.println("in myexce");
		}
		/*catch(Exception  e) {
			System.out.println("in exce");
		}
		*/
	}
	public static void main(String[] args) {
		foo();
		
		String x="xyz";
		if("xyz".equals("abc"));
	}
}
