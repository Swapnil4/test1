package set;

import java.util.TreeSet;

public class TreeSeteg {
	
	public static void main(String[] args) {

		TreeSet ts=new TreeSet(new Mycomprator());
		
		ts.add("a");
		ts.add("z");
		ts.add("c");
		
		ts.add("b");
		
		System.out.println(ts);

	}
}
