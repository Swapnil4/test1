package speech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Spech implements Comparator {
	
	
	public static void main(String[] args) {
		
		Object obj=new Object();
		
		obj.toString();
		String s=new String();
		
		s.toString();
		Integer i=new Integer(0);
		
		//ArrayList ls=new ArrayList<>(-(-(-1)));
		
		System.out.println((1==1));
		ArrayList ls=new ArrayList<>();
		System.out.println("before limit cross========"+ls.hashCode());
		
		System.out.printf("");
		
		ls.add(1113690);
		System.out.println("1 item added cross========"+ls.hashCode());
		
		ls.add(2);
		System.out.println("1 item added cross========"+ls.hashCode());
		ls.add(3);ls.add(4);ls.add(5);
		
		
		System.out.println("middle limit cross========"+ls.hashCode());
		ls.add(6);ls.add(7);ls.add(8);ls.add(9);
		
		System.out.println("after 9th element limit cross========"+ls.size());
		
		
		
		ls.add(10);
		
//	ls.clear();
		System.out.println(ls);
		ls.add(11);
		

		System.out.println("after 10th element limit cross========"+ls);
		
	Collections.sort(ls);	
		
	/* new	IllegalArgumentException(); 
*/	
		
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}


	

}
