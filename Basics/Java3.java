class Java3
{
	public static void main(String args[])
	{
		int n = args.length;

		float avg;
		
		int sum = 0;
	
		for(int i = 0; i<n; i++)
		{	
			System.out.print(" [ "+(i+1)+" ] : ");
			System.out.println(""+Integer.parseInt(args[i]));
			sum = sum + Integer.parseInt(args[i]);
		}
		
		avg = sum/n;
		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+avg);
	}
}
