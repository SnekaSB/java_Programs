package collectiondemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(12, "sneka");
		hm.put(14, "ram");
		hm.put(11,"sneka");
		hm.put(15, "sri");
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println(s);
		Collection c=hm.values();
		System.out.println(c);
		Set s1=hm.entrySet();
		System.out.println(s1);
		
		Iterator it=s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}

}
