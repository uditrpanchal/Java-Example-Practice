import java.util.Scanner;

class Array
{
	private int arr[];
	private int sum;
	private int lent;
	private double avg;
	int r=0;
	
	Scanner s=new Scanner(System.in);

	public Array()
	{
		arr=new int[10];
		for(int f=0;f<10;f++)
			arr[f]=f+1;
		lent=arr.length;
	}

	public Array(int size)
	{
		arr=new int[size];
		for(int g=0;g<size;g++)
			arr[g]=s.nextInt();
		lent=size;
	}

	public void print()
	{	
		for(int i=0;i<lent;i++)
			System.out.println("arr["+i+"]="+arr[i]);
	}

	public int sum()	
	{
		for(int j=0;j<lent;j++)
			sum+=this.arr[j];
		
		return sum;
	}

	public double avg()
	{
		avg=sum/lent;
		return avg;
	}
	
	public Array(Array h)
	{
		arr=new int[h.arr.length];	
		for(int k:h.arr)
		{
			
			this.arr[r]=k;
			r++;
		}
		lent=arr.length;
		
	}

	public int find(int val)
	{
		int i;
		for(i=0;i<lent;i++)
		{
			if(arr[i]==val)
			{
				break;
			}
		}
	
		return i;
	}
	
}

public class Class2
{
	public static void main(String args[])
	{
		Array a=new Array();
		a.print();
		int ind1=a.find(3);

		System.out.println("Enter 10 Numbers for Sum,Average and Finding :");
		Array b=new Array(10);
		b.print();
		int ind2=a.find(4);

		int sum1=a.sum();
		double avg1=a.avg();
				
		System.out.println("Sum of elements of array a="+sum1);		
		System.out.println("Avg of elements of array a="+avg1);
		System.out.println("finding element a is at index="+ind1);
		System.out.println("finding element b is at index="+ind2);		
	
		int sum2=b.sum();
		double avg2=b.avg();
				
		System.out.println("Sum of elements of array b="+sum2);		
		System.out.println("Avg of elements of array b="+avg2);

		Array c=new Array(a);
		c.print();
		int ind3=c.find(5);
		System.out.println("finding element of c is="+ind3);		
		
		
	}
}
