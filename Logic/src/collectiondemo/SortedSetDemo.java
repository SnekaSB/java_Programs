package collectiondemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet ss=new TreeSet();
		ss.add("sneka");
		ss.add(null);
		ss.add("Ram");
		ss.add("saravana");
		ss.add("subu");
		System.out.println(ss);
        System.out.println(ss.comparator());

	}

}
