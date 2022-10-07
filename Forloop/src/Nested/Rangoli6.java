package Nested;

public class Rangoli6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a =1;a<=8;a++)
		{
			for (int b =7;b>=a;b--)
			{	
				System.out.print(" ");
			}
			for (int e =1;e<=a;e++)
			{
			System.out.print("*");
			    }
			for ( int c=2;c<=a;c++) 
			{
				System.out.print("*");	
			}
			System.out.println(" ");
		}
		for (int a =7;a>=1;a--)
		{
			for (int b =7;b>=a;b--)
			{	
				System.out.print(" ");
			}
			for (int e =1;e<=a;e++)
			{
			System.out.print("*");
			    }
			for ( int c=2;c<=a;c++) 
			{
				System.out.print("*");	
			}
			System.out.println(" ");
		}
		
		
	}

}
