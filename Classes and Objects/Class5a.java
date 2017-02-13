class MyClass
{	
	static int a,b,c;

	private MyClass()
	{
		a = 10;
		b = 15;
		c = 20;
	}

	private MyClass(int x,int y,int z)
	{
		a = x;
		b = y;
		c = z;
	}

	public static MyClass getSample()
	{
		return new MyClass();
	}

	public static MyClass getSample(int x,int y,int z)
	{
		return new MyClass(x,y,z);
	}

}

public class Class5a
{
	public static void main(String[] args)
	{
		//MyClass m1 = new MyClass();
		MyClass m1 = MyClass.getSample();
		System.out.println("Elements of MyClass are : "+m1.a+","+m1.b+","+m1.c);
		MyClass m2 = MyClass.getSample(11,22,33);
		System.out.println("Elements of MyClass are : "+m2.a+","+m2.b+","+m2.c);
		System.out.println("Elements of MyClass are : "+m1.a+","+m1.b+","+m1.c);
	}
}
