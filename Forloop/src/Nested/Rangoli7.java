package Nested;

public class Rangoli7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int a=1;a<=8;a++)// row (reverse pyramid)
	//for (int a=8;a>=1;a--)
{
	for ( int b=2;b<=a;b++ )// column space
	{
		System.out.print(" ");
	}
	for (int c=8;c>=a;c--)// column star
	{
		System.out.print("*");
	}
	for (int d =7;d>=a;d--)	// column star
	{
		System.out.print("*");
	}
	System.out.println(" ");
}
	}

}
