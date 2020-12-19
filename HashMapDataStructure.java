import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
public class HashMapDataStructure {
	public static void main(String args[]) {
		
		HashMap<String,Integer> map1=new HashMap<>();
		map1.put("Anushka",30);
		map1.put("Ankur",23);
		map1.put("Mitali",72);
		map1.put("Abhinav",05);
		map1.put("Anirudh",21);
		
		System.out.println("ROLL NO. OF aNUSHKA IS  : "+map1.get("Anushka"));
		
		for(Map.Entry<String,Integer> e: map1.entrySet()) {
			System.out.println("The roll no. of "+e.getKey()+" is "+ e.getValue());
		}
		
		Iterator itr=map1.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		String str="Ankur, saini, is Abhinav, abhinav;;;;;;;;;,. .rana and mitali is Ankur ;;;;Saini and mitali is ankur mitali";
		HashMap<String,Integer> map2=new HashMap<>();
		
		StringTokenizer st1=new StringTokenizer(str," ;,.",true);
		while(st1.hasMoreTokens()) {
			String st=st1.nextToken().toLowerCase();
			if(map2.containsKey(st)) {
				int count=map2.get(st);
			map2.put(st,count+1);
			}
			else {
				map2.put(st,1);
			}
		}
		System.out.println(map2);
		System.out.printf("NO> OF , are  : "+map2.get(","));
		System.out.printf("NO OF ;  are  : "+map2.get(";"));
		System.out.printf("NO OF spaces  are  : "+map2.get(" "));
		
	}
	
}
