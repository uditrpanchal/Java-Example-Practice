interface interfac
{
	int a = 10;
	float b = 2.5f;
	double d = 3.7;
	char ch = 'C';
	String name = "Udit Panchal";
	Boolean state = true;
}

public class Inher8
{
	public static void main(String[] args)
	{

		System.out.println("\ta     : "+interfac.a);
		System.out.println("\tb     : "+interfac.b);
		System.out.println("\td     : "+interfac.d);
		System.out.println("\tch    : "+interfac.ch);
		System.out.println("\tname  : "+interfac.name);
		System.out.println("\tstate : "+interfac.state);
	}
}
