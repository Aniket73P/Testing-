
package Assignment_core_java;

public class P7_Pattern 
{
	
	public static void main(String[] args)
	{
     
		// for the first Pattern		
		for(int i =1;i<=5;i++) 
		{//rows
			for(int j =1;j<=i;j++) 
			{//columns
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
	   // for the second pattern
	   for ( int i = 1 ; i <= 5 ; i++ )
	   {
		   for ( int j = 1 ; j <= i ; j++ )
		   {
			   System.out.print(i);
		   }
		   System.out.println();   
	   }
   		
	   System.out.println("-----------------------------------------------");
	   
		// for the third Pattern
		for (int a = 1; a <= 5; a++) 
	    {
	        for (int j = 1; j <= a; j++) 
	        {
	            if ((a + j) % 2 == 0) 
	            {
	                System.out.print("1 ");
	            } else 
	            {
	                System.out.print("0 ");
	            }
	        }
	        System.out.println();
	    }
	   
	   System.out.println("--------------------------------------------"); 

	   
	   //for the fourth Pattern
	    for ( int T=1;T<=4;T++)
		{
			for(int j=3;j>=T;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=T;k++)
			{
				System.out.print(T+" ");
			}
			System.out.println();
		} 

	   System.out.println("-----------------------------------------------------");
	   
	    // for the fifth Pattern
	    int number = 3;
		int m ,n;
		
		for(m = 1; m <= number; m ++)
		{
			for(n = 1; n <= number-m; n++)
			{
				System.out.print(" ");
				
			}
			for(n = 1; n <= m*2-1; n++)
			{
				System.out.print("*");
			}
			System.out.println();
		
			
		}System.err.println();
		
		for(m = number - 1; m > 0; m -- )
		{
			for(n = 1; n <= number-m; n ++)
			{
				System.out.print(" ");
			}
			for(n = 1; n <= m*2-1; n++)
			{
				System.out.print("*");
				
			}
			System.out.println();
	   }
		
}
}