package collectiondemo;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add("sneka");
		ls.add(4);
		ls.add(true);
		ls.add(null);
		ls.add(null);
		System.out.println(ls);
		ls.remove("sneka");
		System.out.println(ls);
		System.out.println(ls.indexOf(5)); //-1

	}

}
