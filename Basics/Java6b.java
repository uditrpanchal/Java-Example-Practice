public class Java6b
{
	public static void main(String[] args)
	{
		int n1,n2,gcd = 0;
		n1 = 46;
		n2 = 23;

		if(n1>n2)
		{
			for(int i=1;i<=n2;i++)
			{
				if(n1%i == 0 && n2%i ==0)
					gcd = i;
			}
		}
		else if(n1<n2)
		{
			for(int i=1;i<=n1;i++)
			{
				if(n1%i == 0 && n2%i ==0)
					gcd = i;
			}
		}
		else if(n1==n2)
			gcd = n1;

		System.out.println("GCD of "+n1+" and "+n2+" is : "+gcd);
	}
}
