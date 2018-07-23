package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class M1 {
	
	public static void main(String[] args) {
		
		// map is maintain order
		
		M1 m=new M1();
		List ls;
		String s=new String();
		Enum en;
		//List ls=new ArrayList<>();
		
		Map<String, String> hm=new  ConcurrentHashMap<>();
		
		/*Map<String, String> hm=new HashMap<>();
		String s1=null;
		hm.put("abc", "aaa");// in this case direct string also get 
		
		
		hm.put(s1, "hhh"); //direct object also get
		String s2=new String("raj");
		hm.put(s2,"ppp");
		*/
		
		
		/*Map<StringBuffer, String> hm=new HashMap<>();
		
		hm.put("a", "abc");//X  which class type that class type object passed we canot pass literal to string class  as object  to Otheer type class
		StringBuffer sb=new StringBuffer();
		hm.put(sb, "abc");// V
		
		*/
		
		
		/*StringTokenizer st=new StringTokenizer("abc");// this class is not final but string class is final
		
		
		Map<StringTokenizer, String> hm=new HashMap<>();
		
		hm.put("abc", "a"); // wrong becouse StringTokenizer only take that type object you pass the String type object 
		
		hm.put(st, "a");// correct  you pass the exact string tokenizer type object
		*/
		
		
		
		
		
		
		/*Map<Integer, String> mp=new HashMap<>();
		// equals & hashcode method  contract  key will not take duplicate  but  value duplicate 
		 * post code example see relised
		 * according to value you override  key also
		 * one village does not different postcode
		
		mp.put(1, "abc");

		System.out.println(mp);
		
		mp.put(3, "abc");

		System.out.println(mp);
		
		mp.put(1, "abc");

		System.out.println(mp);
		
		mp.put(2, "abc");
		
		System.out.println(mp);
		o/p
{1=abc}
{1=abc, 3=abc}
{1=abc, 3=abc}
{1=abc, 2=abc, 3=abc}

*/		
	}

}
