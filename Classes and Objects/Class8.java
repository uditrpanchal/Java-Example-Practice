class StaticInit
{
	static
	{
		int a = 10;
		int b = 20;

		System.out.println("Static ||  A : "+a+"\t B : "+b);
	}

	{
		System.out.println("System Initializer BLOCK ");
	}
}

public class Class8
{
	public static void main(String args[])
	{
		StaticInit a1 = new StaticInit();
		StaticInit a2 = new StaticInit();
		StaticInit a3 = new StaticInit();
		StaticInit a4 = new StaticInit();
		StaticInit a5 = new StaticInit();
	}
}
		

