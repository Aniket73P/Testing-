package Assignment_core_java;

import java.util.Scanner;

public class P03_factorialNumber {
	public static void main(String[] args) {
		int num;
		int i, fact = 1;
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter num to find factorial :");
		num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of" + num + "is:" + fact);
	}

}
