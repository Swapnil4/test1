package set;

import java.util.Comparator;

public class Mycomprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		
		
		String I1=(String)o1;

		String I2=(String)o2;
		
		if(I1.equals(I2))
	
		
		return 0;
		
		else 
				
		return I2.compareTo(I1);
		
	}

}
