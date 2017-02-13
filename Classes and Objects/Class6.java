class BoxClass
{	
	int a = 0;
	int b = 0;
	int c = 0;
}

class Class6
{
	public static void main(String args[])
	{
		BoxClass Box[] = new BoxClass[3];
		Box[0] 	       = new BoxClass();
		Box[0].a       = 10;
		Box[0].b       = 20;
		Box[0].c       = 30;

		Box[1]	       = new BoxClass();
		Box[1].a       = 11;
		Box[1].b       = 22;
		Box[1].c       = 33;

		Box[2]	       = new BoxClass();		
		Box[2].a       = 1234;
		Box[2].b       = 4321;
		Box[2].c       = 9999;

		System.out.println("A [1]:  "+Box[0].a);
		System.out.println("B [1]:  "+Box[0].b);
		System.out.println("C [1]:  "+Box[0].c);
		System.out.println();

		System.out.println("A [2]:  "+Box[1].a);
		System.out.println("B [2]:  "+Box[1].b);
		System.out.println("C [2]:  "+Box[1].c);
		System.out.println();

		System.out.println("A [3]:  "+Box[2].a);
		System.out.println("B [3]:  "+Box[2].b);
		System.out.println("C [3]:  "+Box[2].c);
		System.out.println();
	}
}

		
