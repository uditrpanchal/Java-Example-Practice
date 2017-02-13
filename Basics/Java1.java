import java.util.Scanner;
class Java1
{
	public static void main(String args[])
	{
		int a,b;
		Scanner kb = new Scanner(System.in);
	

		System.out.println();
		System.out.println();
		System.out.print("Enter the Value of A : ");
		a = kb.nextInt();

		System.out.print("Enter the Value of B : ");
		b = kb.nextInt();

		int c = a + b;

		System.out.println("Summation            : "+ a +" + "+ b +" = "+c);
		System.out.println();	
		System.out.println();
	}
}
