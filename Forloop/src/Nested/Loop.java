package Nested;

public class Loop {

	public static void main(String[] args) {

	for(int b = 1;b<=8;b++)
		//	for(int b = 8;b>=1;b--) //will reverse triangle
{
     for (int a=7;a>=b;a--)
	{
    	 
		 System.out.print(" ");
	}
		for (int c=1;c<=b;c++)
		{
			System.out.print("*");
			
		}
	
		System.out.println( );
		
	}
	
	
	}
}
