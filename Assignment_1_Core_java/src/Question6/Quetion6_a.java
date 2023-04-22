
/*boolean value into String

package Assignment1;

public class Quetion6_a {

	public static void main(String[] args) {
		
			      boolean b1 = false;
			      
			      String str1 = new Boolean(b1).toString();
			     
			      System.out.println(str1);
		
			   
			

	}

}*/

//boolean value into Boolean instance

package Question6;

public class Quetion6_a {

	public static void main(String[] args) {
		
		boolean b = false;
		
		Boolean True = new Boolean(b).valueOf(b);
		System.out.println(True);
		

	}

}
