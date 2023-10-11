package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(45);
		al.add("sneka");
		al.add(23);
		al.add(1,"sri");
		System.out.println(al);
		
		//Size
		System.out.println(al.size());
		
		//Using generic function
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("sneka");
		al1.add("ram");
		al1.add("balu");
		System.out.println(al1);
		
		//Remove
	    al1.remove(0); //based on index
	    System.out.println(al1);
        al1.remove("ram"); //bed on object
        System.out.println(al1);
		
       // three ways to read array
        // for loop
        for(int i=0;i<al.size();i++) {
        	System.out.println(al.get(i));
        }
        
        //for each
        for(String s:al1) {
        	System.out.println(al1);
        	
        }
        
        //iterator
        Iterator it=al.iterator();
        while(it.hasNext()) {
        	it.next();
        }
         //array to arraylist
        String[] str= {"sneka","ram","saravana","subu"};
        for(String s:str) {
        	System.out.println(s);
        }
        ArrayList ar=new ArrayList(Arrays.asList(str));
        System.out.println(ar);
        
        //sort
        ArrayList al3=new ArrayList();
       
        al3.add("A");
        al3.add("b");
        al3.add("c");
        al3.add("d");
        al3.add("A");
        al3.add("e");
        
        Collections.sort(al3);
        System.out.println(al3);
        
        Collections.reverse(al3);
        System.out.println(al3);
        
        Collections.shuffle(al3);
        System.out.println(al3);
	}

}
