package Strings_durga_sir;

public class Demo_StringBuffer {

	public static void main(String[] args) {
	
		StringBuffer sb=new StringBuffer("basava");
		sb.append("Raj");sb.append("6362044351");
		sb.setLength(15);
		sb.insert(9," ");
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
//		max String cap=16
		StringBuilder sb1=new StringBuilder();
		sb1.append("shiva ").append("shankara ").append(" mahadeva  ").insert(25," kumaraswamy").reverse();
		System.out.println(sb1);
		
		
		
	}

}
