package Strings_durga_sir;

public class demoString {

	public static void main(String[] args) {
		String s="basava";
		String s2="raj";
		String s3="basavaraj";
		System.out.println(s+s2);
		String s1=s.concat(s2);
		System.out.println(s1);
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(2,9));
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.compareToIgnoreCase(s));
		

	}

}
