package Question24;

import java.util.Scanner;

public class Question24 {

	      public static void main(String args[]){
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter number :");
	        float b = sc.nextFloat();
	        String s = new String(Float.toString(b));
	        
	        System.out.println("float value into String "+Float.toString(b));
	        System.out.println("float value into float instance.. "+Float.valueOf(b));
	        System.out.println("String instance into float instance. "+Float.valueOf(s));
	        System.out.println("float value into hexadecimal "+Float.toHexString(b));
	    }
	      
}
//24.Write a program to convert:
//a. float value into String
//b. float value into Float instance.
//c. String instance into Float instance.
//d. float value into hexadecimal string.