package map;


public class M2 {
	public static void main(String[] args) {
		
		
	String s="ram";
	
	char ch[]=s.toCharArray();
	char c;
	char chm;
//above  output coming 	
	
	for (int i = 0; i <ch.length; i++) { //iterate one by one 
		 
		for (int j = 0; j <122;  j++) { //
			
			c=(char)j;
			if(c==ch[i])
			{
				System.out.println(j+" "+ch[i]);
				
				j=j+2238;
				System.out.println(chm=((char)j));
				
				//here all marathi cases uses in switch case
				
				
			}
		}
	}
	
	}
	
	
	
		
	}


