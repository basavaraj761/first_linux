package collections_durga;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("basava");
		al.add(100);
		al.add("Amma");
		al.add("Appa");
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		

	}

}
