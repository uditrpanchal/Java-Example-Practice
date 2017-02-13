class Java3n
{
	public static void main(String args[])
	{
		int n = args.length;
		double sum =0,avg = 0;

		for(int i = 0; i<n ; i++)
		{
			System.out.println(" [ "+(i+1)+" ] : "+Double.parseDouble(args[i]));

			sum = sum + Double.parseDouble(args[i]);
		}

		avg = sum/n;

		System.out.println("Sum    : "+sum);
		System.out.println("Avg    : "+avg);
	}
}

