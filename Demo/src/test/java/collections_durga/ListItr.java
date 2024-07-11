package collections_durga;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItr {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> l=new ArrayList<Comparable>();
		l.add("basava");
		l.add(100);
		l.add("Amma");
		l.add("Appa");
		
		ListIterator ltr=l.listIterator(); 
				while(ltr.hasNext())
				{
		System.out.println(ltr.next());
		}
}
}
