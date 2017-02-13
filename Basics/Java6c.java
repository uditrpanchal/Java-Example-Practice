import java.util.Scanner;
public class Java6c
{
	public static void main(String [] args)
	{
		int n;
		Scanner no = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.print("Enter the Number(Shows PRIME  numbers upto that number) :: ");
		n = no.nextInt();
		System.out.println();
		int count;
		int a[] = new int[n];
		for(int i=1;i<=n;i++)	
		{
			count = 0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}

			if(count==2)
			{
			
				System.out.println(""+i);
			}
		}
	}
}
