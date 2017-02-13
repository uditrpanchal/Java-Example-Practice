class Java2
{
	public static void main(String args[])
	{
		int n = args.length;

		int a[] = new int[n];

		for(int i=0; i<n; i++)
		{
			System.out.println(" ["+(i+1)+"] : "+args[i]);
		}
	}
}
