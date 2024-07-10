package OOps_concepts;

 class parent{
	
	public void sum() {
		System.out.println("from parent");
	}
	public void mul() {
	System.out.println("from parent");

	}
}

 class c extends parent{
	 public void m2() {
		 System.out.println("from child");
	 }
	 
 }
 class Test{
	 public static void main(String[] args) 
	 {
		c c1=new c();
		c1.m2();
		c1.sum();
		c1.mul();
	}
 }



			
	