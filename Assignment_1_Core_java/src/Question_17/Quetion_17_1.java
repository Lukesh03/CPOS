package Question_17;
import java.util.Scanner;
public class Quetion_17_1 {
	
       public static void main(String args[]){
    	   
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter Integerto convert state of Integer instance into byte, short, int, long, float and double");
	        Integer i=new Integer(sc.nextInt());
	        
	        System.out.println();
	        System.out.println("Integer to byte "+i.byteValue());
	        System.out.println("Integer to short "+i.shortValue());
	        System.out.println("Integer to int "+i.intValue());
	        System.out.println("Integer to long "+i.longValue());
	        System.out.println("Integer to float "+i.floatValue());
	        System.out.println("Integer to double "+i.doubleValue());
	             
	        
	    }
	}



/* 17. Write a program to convert state of Integer instance 
into byte, short, int, long, float and double.*/