package logic;

public class A implements I,I1{
	
	
	B m1()
	{
		I1 i1=new A();
		I i=(I) i1;
		
		A b=new A();
		return b ;
	}
	
	
	public static void main(String[] args) {
	A a=new A();
		
		//I i1=a.m1();
		
		//System.out.println(i1);
	}

}
