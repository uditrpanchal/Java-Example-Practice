class Wrap
{
	private int k;
	private int l;
	
	Wrap()
	{
	   k=1111;
	   l= 5555;
	}
	
	public void wrapit()
	{

	System.out.println("Value of K : "+k);
	System.out.println("Value of L : "+l);
		Integer it1 = new Integer(k);  // it wrapps k into it1
		Integer it2 = new Integer(l); // it wraps l into it2

		k = it2.intValue(); // swapping 
		l = it1.intValue();
	
	System.out.println();
	System.out.println("NEW Value of K : "+k);
	System.out.println("NEW Value of L : "+l);
	
	}
}
	

public class Class9
{
	public static void main(String args[])
	{
	  Wrap w1 = new Wrap();
	
	  w1.wrapit();
	}
}
	   
