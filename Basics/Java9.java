import java.util.Scanner;
import java.lang.String;

public class Java9
{
	public static void main(String[] args)
	{
		String n1 = "Udit",n2,n3,n4,n5,n6;
		int l3;
		char arr[] = new char[5];
		char arr1[] = new char[20];

	 // Read Operation
		Scanner kb = new Scanner(System.in);
		n2 = kb.nextLine();

	// Write Operation
		System.out.println("n1 : "+n1+"\nn2 : "+n2+"\n");

	//Length Operation
		int l1 = n1.length();
		int l2 = n2.length();
		System.out.println("Length of n1 : "+l1+"\nLength of n2 : "+l2+"\n");

	// Retrieving Character
		System.out.println("Retriving string in form of array : ");
		for(int i = 0;i<l1;i++)
		{
			arr[i] = n1.charAt(i);
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		System.out.print("\n");
	
	// Copy
		n3 = String.copyValueOf(arr);
		System.out.println("Copy Operation : n3 = n1 ---> "+n3);
		l3 = n3.length();
		System.out.println("Length of string n3 : "+n3+" is : "+l3+"\n");
	
	// Concat
		n3 = n3.concat(n2);	
		System.out.println("Concatenated String : n3 = n2 + n1 (now stored in n3 also) ---> "+n3);
		l3 = n3.length();
		System.out.println("Length of string n3 : "+n3+" is : "+l3+"\n");
	
	// Compare
		n5 = "CrossOver";
		n6 = "MoreOver";
		int com_res = n5.compareTo(n6);
		System.out.println("Output of Comparing Strings : "+com_res+"\n");	

	
	// Reverse 
		System.out.println("Printing n3 string using array : ");
		for(int i = 0;i<l3;i++)
		{
			arr1[i] = n3.charAt(i);
			System.out.print(""+arr1[i]);
		}
		System.out.print("\n\n");
		
		n3 = "";
		System.out.println("Printing n3 string in Reverse : ");
		for(int i = l3-1;i>=0;i--)
		{
			n3 = n3+arr1[i];
		}
		System.out.println("Reversed String n3 : "+n3+"\n");

	//Printing triangle 
		n4 = "JAVA The Complete Reference";
		int l4 = n4.length();
		System.out.println("Length of string n4 : "+n4+" is : "+l4);
		System.out.println("Printing String in Triangulered Form : ");
		for(int i=0;i<l4;i++)
		{
			for(int j =0;j<=i;j++)
			{
				System.out.print(""+n4.charAt(j));
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	
	}
}
