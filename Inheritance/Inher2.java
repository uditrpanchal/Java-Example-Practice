interface Employee
{
	public void getsalary();
	public void getbonus();

}

class Engineer implements Employee
{
	int eid = 1111;
	String name = "Udit Panchal";
	double Salary = 25000;
	
	public void getsalary()
	{
		System.out.println("Employee ID    : "+eid);
		System.out.println("Employee Name  : "+name);
		System.out.println("Employee Salary: "+Salary);
	}

	public void getbonus()
	{
		double bonus;
		bonus = Salary * 0.1;

		Salary = Salary + bonus;

		System.out.println("Employee ID    : "+eid);
		System.out.println("Employee Name  : "+name);
		System.out.println("Employee Bonus : "+bonus);
	}
}

class Manager implements Employee
{
	int eid = 2222;
	String name = "Jason Statham";
	double Salary = 65000;
	
	public void getsalary()
	{
		System.out.println("Manager ID    : "+eid);
		System.out.println("Manager Name  : "+name);
		System.out.println("Manager Salary: "+Salary);
	}

	public void getbonus()
	{
		double bonus;
		bonus = Salary * 0.1;

		Salary = Salary + bonus;

		System.out.println("Manager ID    : "+eid);
		System.out.println("Manager Name  : "+name);
		System.out.println("Manager Bonus : "+bonus);
	}
}

class Admin implements Employee
{
	int eid = 3333;
	String name = "Dharmik Tarun";
	double Salary = 45000;
	
	public void getsalary()
	{
		System.out.println("Admin ID    : "+eid);
		System.out.println("Admin Name  : "+name);
		System.out.println("Admin Salary: "+Salary);
	}

	public void getbonus()
	{
		double bonus;
		bonus = Salary * 0.1;

		Salary = Salary + bonus;

		System.out.println("Admin ID    : "+eid);
		System.out.println("Admin Name  : "+name);
		System.out.println("Admin Bonus : "+bonus);
	}
}

public class Inher2
{
	public static void main(String args[])
	{
		Employee e1,e2,e3;

		e1 = new Engineer();
		e2 = new Manager();
		e3 = new Admin();

		e1.getsalary();
		e1.getbonus();
		e1.getsalary();
		System.out.println();

		e2.getsalary();
		e2.getbonus();
		e2.getsalary();
		System.out.println();

		e3.getsalary();
		e3.getbonus();
		e3.getsalary();
		System.out.println();


	}
}
