import java.util.Scanner;
class Java7c
{
	public static void main(String args[])
	{
		int m = 10;
		int arr[] = new int[m];

		int i,j,k,l;

		Scanner kb = new Scanner(System.in);


		for(i=0; i<m ; i++)
		{
			arr[i] = (int)(Math.random()*100);
			System.out.println(" [ "+(i+1)+" ] :"+arr[i]);
		}

		System.out.print("Enter the Number for SEARCH : ");

		l = kb.nextInt();
		

		for(i=0; i<m ; i++)
		{
			if(l == arr[i])
			{
				System.out.println("Matched Number : "+arr[i]);
			}
			else
			{
				
			}
		}
	}
}
