package collections_durga;

import java.util.*;

public class Array_List_demo {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("shiva");
		al.add("basava");
		al.add(null);
		al.add(1, "shankara");
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
	}

}
     