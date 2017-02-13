interface I1
{
	int a = 11;
	int b = 22;
	public void sum();
}

interface I2
{
	int c = 30;
	public void square();
}

class A implements I1,I2
{
	public void sum()
	{
		int s = a+b;
		System.out.println("Sum of a and b : "+s);
	}
	
	public void square()
	{
		int sq = c*c;
		System.out.println("Square of a : "+sq);
	}
	
}

public class Inher9
{
	public static void main(String [] args)
	{
		I1 a = new A();
	 //Must import I1 a = new A() where "I1 a" --> REFERENCE OF INTERFACE and "new a()" is OBJECT OF CLASS
		I2 b = new A();
		a.sum();
		b.square();
	}
}
