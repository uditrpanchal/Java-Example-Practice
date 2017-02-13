//abstract class Employees
class Employees
{
	int eid;
	int sal;
	String name;
	public Employees(int e,int s,String n)
	{
		eid = e;
		sal = s;
		name = n;
	}

	//public void getSalary(int e)
	public void getSalary()
	{
		System.out.println("EID : "+eid+", Name : "+name+", Salary : "+sal);
	}

	//abstract public void getBonus();
	 public void getBonus()	{
		System.out.println("Super Class getBonus DEfination");	}
}

class Engineer extends Employees
{
	public Engineer(int e,int s,String n)
	{
		super(e,s,n);
	}

	public void getBonus()
	{
		double Bonus;
		Bonus = sal*0.1;
		sal+=Bonus;
		System.out.println("ENGINEER>>> EID : "+eid+", Name : "+name+", Bonus : "+Bonus);
	}
}

class Manager extends Employees
{
	public Manager(int e,int s,String n)
	{
		super(e,s,n);
	}


	public void getBonus()
	{
		double Bonus;
		Bonus = sal*0.1;
		sal+=Bonus;
		System.out.println("MANAGER >>> EID : "+eid+", Name : "+name+", Bonus : "+Bonus);
	}
}

class Admin extends Employees
{
	public Admin(int e,int s,String n)
	{
		super(e,s,n);
	}

	public void getBonus()
	{
		double Bonus;
		Bonus = sal*0.1;
		sal+=Bonus;
		System.out.println("ADMIN >>> EID : "+eid+", Name : "+name+", Bonus : "+Bonus);
	}
}
public class Inher4
{
	public static void main(String[] args)
	{
		Employees e1,e2,e3;
		e1 = new Engineer(1001,40000,"Udit Panchal");
		e2 = new Manager(2001,50000,"Thomas Alwa Edison");
		e3 = new Admin(3001,45000,"Tom Cruise");

		System.out.println();
		e1.getSalary();
		e1.getBonus();
		e1.getSalary();
		System.out.println();

		e2.getSalary();
		e2.getBonus();
		e2.getSalary();
		System.out.println();
		
		e3.getSalary();
		e3.getBonus();
		e3.getSalary();
		System.out.println();

	}
}
