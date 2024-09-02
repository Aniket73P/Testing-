package Assignment_core_java;

import java.util.Scanner;

public class P3_factorialNumber {
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter num to find factorial :");
		int num = sc.nextInt();
		int fact = 1 ;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of" + num + "is:" + fact);
	    sc.close();
	
	}

}
