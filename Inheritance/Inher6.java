interface Employees
{
	public void getSalary();
	public void getBonus();
}

class Engineer implements Employees
{
	int eid = 1001,sal = 50000;
	String name = "Udit Panchal";

	public void getSalary()
	{
		System.out.println("ENGINEER ---> EID : "+eid+", Name : "+name+", Salary : "+sal);
	}

	public void getBonus()
	{
		double Bonus;
		Bonus = sal*0.1;
		sal+=Bonus;
		System.out.println("ENGINEER ---> EID : "+eid+", Name : "+name+", Bonus : "+Bonus);
	}
}

class Manager implements Employees
{
	int eid = 2001,sal = 40000;
	String name = "Dharmik Brahmbhatt";

	public void getSalary()
	{
		System.out.println("MANAGER ---> EID : "+eid+", Name : "+name+", Salary : "+sal);
	}

	public void getBonus()
	{
		double Bonus;
		Bonus = sal*0.1;
		sal+=Bonus;
		System.out.println("MANAGER ---> EID : "+eid+", Name : "+name+", Bonus : "+Bonus);
	}
}

class Admin implements Employees
{
	int eid = 3001,sal = 45000;
	String name = "Tom Cruise";

	public void getSalary()
	{
		System.out.println("ADMIN ---> EID : "+eid+", Name : "+name+", Salary : "+sal);
	}

	public void getBonus()
	{
		double Bonus;
		Bonus = sal*0.1;
		sal+=Bonus;
		System.out.println("ADMIN ---> EID : "+eid+", Name : "+name+", Bonus : "+Bonus);
	}
}
public class Inher6
{
	public static void main(String[] args)
	{
		Employees e1,e2,e3;
		e1 = new Engineer();
		e2 = new Manager();
		e3 = new Admin();


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
