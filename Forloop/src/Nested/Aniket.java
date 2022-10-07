package Nested;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Aniket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
			
			String date = form.format(new Date(0));
			
			System.out.println(date);
		
		byte b ;
		
		int z = 78;
		
		//System.out.println(b);
		System.out.println("========");
		
		b = (byte)z;
		
		System.out.println(b);

		
		
	String a = ("Aniket");	
	
  for (int i=0;i<=a.length()-1;i++)
  {
	for(int j=0;j<a.length()-i;j++)
	{
		char x = a.charAt(j);
		System.out.print(x);
	}
	System.out.println();
  }
		
		
		
		
	}

}
