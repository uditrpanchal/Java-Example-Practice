public class Java7a
{
	public static void main(String args[])
	{
		int m = 10;
		int arr[] = new int[m];
		int sum=0;
		int avg=0;


		for(int i=0; i<m; i++)
		{
			arr[i] = (int)(Math.random()*100);
		}

		for(int i=0; i<m; i++)
		{
			System.out.println("   "+(i+1)+" :   "+arr[i]);			
			sum = sum + arr[i];
		}
		
		
		
		avg = sum/m;

		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+avg);
	}
}



		
			
