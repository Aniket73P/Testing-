package Assignment_core_java;

public class P8_Sumprimenumber {
	public static void main(String args[]) 
	 {	
	  int count,sum =100;
	  for(int number=1; number <= 100; number++)
	  {
	   count = 0;  
	   for (int i = 2; i <= number/2; i++)  
	   {
		   if(number % i == 0)  
		   {
			   count++;  
			   break;
		   }
	   }
	   if(count == 0 && number != 1 )  
	   {
		   sum = sum + number;  
	   }
	  }
	  System.out.println("The Sum of Prime Numbers from 1 to 100 is: " + sum);
	 }

}
