package Assignment_core_java;

import java.util.Scanner;

public class P1_GreatestNumber {

 

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the first number:");
	        int a = sc.nextInt();
	        System.out.println("Enter the second number:");
	        int b = sc.nextInt();
	        System.out.println("Enter the third number:");
	        int c = sc.nextInt();

	        // Using Math.max() to find the greatest number
	        int maxNumber = Math.max(Math.max(a, b), c);

	        System.out.println("The greatest number is " + maxNumber);
	        
	        
	    }
	}

	
	
