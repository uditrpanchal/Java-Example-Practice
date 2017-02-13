import java.lang.Math;
public class Java8c
{
	public static void main(String args[])
	{
		int a[][] = new int[4][4];
		int trace = 0;

		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)	
			{
				a[i][j] = (int)(Math.random()*100);
			}
		}
		
		


		System.out.println("\n\t Array [4][4] : Elements \n\n");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)	
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
			
		
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)	
			{
				if(i == j)
				{
					trace = trace + a[i][j];
				}
			}
			
		}
		System.out.println("\n\t Trace of Matrix [4][4] : Elements \n\n");
		System.out.println("Trace of Given Matrix : "+trace);
	}
}
		

		
