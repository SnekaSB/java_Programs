package collectiondemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		Vector v1=new Vector(2);
		v1.add("sneka");
		v1.add(3);
		v1.add("sri");
		v1.add(null);
		v1.add("d");
		System.out.println(v1.size());
	}

}
