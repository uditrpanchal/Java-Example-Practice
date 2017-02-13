import java.lang.Math;
public class Java8b
{
	public static void main(String args[])
	{
		int a[][] = new int[4][6];
		int b[][] = new int[4][6];
		int c[][] = new int[4][6];

		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)	
			{
				a[i][j] = (int)(Math.random()*100);
			}
		}
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)	
			{
				b[i][j] = (int)(Math.random()*100);
			}
		}
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)	
			{
				c[i][j] = a[i][j] * b[i][j];
			}
		}


		System.out.println("\n\t Array 1[4][6] : Elements \n\n");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)	
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n\t Array 2[4][6] : Elements \n\n");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)	
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n\t Multiplication [4][6] : Elements \n\n");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)	
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
		
	}
}
		

		
