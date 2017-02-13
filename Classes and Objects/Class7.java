class Account
{
	static long minbal = 10000;
	static long count = 0;

	Account()
	{
		count++;
		minbal = minbal * count;
		System.out.println("Count : "+count+"\tMin Bal :  "+minbal);
		
	}
}

class Class7
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		Account a4 = new Account();
		Account a5 = new Account();
	}
}
