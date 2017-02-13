public class Java7b
{
	public static void main(String args[])
	{
		int m = 10,j,l,min;		
		int arr[] = new int[m];

	
		for(int i=0; i<m; i++)
		{	
			arr[i] = (int)(Math.random()*100);
			System.out.println(" [ "+(i+1)+" ] : "+arr[i]);
		}
		
		for(int i = 0; i<m-1 ; i++)
		{	
			l = 0;
			for(j = 0;j<m-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					min       = 	arr[j+1];
					arr[j+1]  = 	arr[j];
					arr[j] 	  = 	min;
					l++;
				}
			}
			if(l == 0)
			{
				break;
			}
		}
		
		System.out.println();
		System.out.println("Array Elements in ASCENDING ORDER");
		System.out.println();
		
		for(int i = 0; i<m ; i++)
		{
			System.out.println(" [ "+(i+1)+" ] : "+arr[i]);
		}
	}
}
