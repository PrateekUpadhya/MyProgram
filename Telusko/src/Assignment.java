public class Assignment {

	public static void main(String args[])
	{
		int i=0,j=0,k;
		char var;
		
		System.out.println("Starts pattern:");
			for(j=0;j<5;j++)
			{
				for(k=0;k<=j;k++)
				System.out.print("*");
				
				System.out.println();
			}
			
		
		System.out.println("Digits pattern:");
		for (i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("Characters pattern");
		for(i=1;i<=5;i++)
		{
			for(int l= 0;l< 5-i; l++)
			{
				System.out.print(" ");
			}
			for(var=65;var<(i+65);var++)
			{
				System.out.print(var);
			}
			System.out.println();
		}	
		
	}
}

