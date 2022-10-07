package Nested;

public class Rangoli8 {

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
		for (int i =1;i<=8;i++)
		{
			for (int j =1;j<=i;j++)
			{	
				System.out.print(" ");
			}
			for (int k =7;k>=i;k--)
			{
			System.out.print("*");
			    }
			for (int z = 6;z>=i;z--)
			{
				System.out.print("*");
			}
			System.out.println(" ");	
	
		}
	}

}
