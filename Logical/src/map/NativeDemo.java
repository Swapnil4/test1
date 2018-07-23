package map;

public class NativeDemo {

	public static void main(String[] args) {
	
		System.out.println("hello main");
		 NativeDemo nd=new NativeDemo();
		 nd.test();
	}
	
	
	public native void test();
	
	static {
		System.loadLibrary("Math");
		}
	

}
