package Question13;

public class Question13_1 {

	public static void main(String[] args) {
		  short s =10;
		  
		  //a. short value into String
		 
	      String S = Short.toString(s);
	      
	      System.out.println("short value into String : "+S);
	      
	      //b. short value into Short instance.
	      Short s1 = new Short(s);
	      System.out.println("short value into Short instance : "+s1);
	      
	      //c. String instance into Short instance.
	      String S2 = new String(Short.toString(s)) ;
	      System.out.println("String instance into Short instance: "+S2);
	    
	

	}

}





/*13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.*/