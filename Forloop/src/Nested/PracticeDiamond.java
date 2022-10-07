package Nested;

public class PracticeDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a=1;a<=8;a++) {
			
		for(int x=7;x>=a;x--)
		{
			System.out.print(" ");
		}
			for(int y=1;y<=a;y++)
			{
				System.out.print("*");

			}
			for(int z=2;z<=a;z++)
			{
				System.out.print("*");

			}
			System.out.println(" ");

			}

		for (int a=7;a>=1;a--) {
			
			for(int x=7;x>=a;x--)
			{
				System.out.print(" ");
			}
				for(int y=1;y<=a;y++)
				{
					System.out.print("*");

				}
				for(int z=2;z<=a;z++)
				{
					System.out.print("*");

				}
				System.out.println(" ");

				}

	}

}
