class Per
{
	int age;
	String name;

	public Per(int a,String n)
	{
		age = a;
		name = n;
		System.out.println("Age         :  "+age);
		System.out.println("Name        :  "+name);
		
	}
}

class Student extends Per
{
	int rollno;
	int standard;

	public Student(int a,String n,int r,int s)
	{
		super(a,n);
		
		rollno = r;
		standard = s;

		System.out.println("Roll no     :  "+rollno);
		System.out.println("Standard    :  "+standard);
		
	}
}

class Employee extends Per
{
	int employeeid;
	int salary;
	String designation;

	public Employee(int a,String n,int emp,int sal,String desi)
	{
		super(a,n);

		employeeid = emp;
		salary = sal;
		designation = desi;
	
		System.out.println("Employee ID :  "+emp);
		System.out.println("Salary      :  "+sal);
		System.out.println("Designation :  "+desi);
		
	}
}

public class Inher1
{
	public static void main(String args[])
	{
		Per p1 = new Per(21,"UDIT Panchal");
		System.out.println();
		System.out.println();

		Student s1 = new Student(22,"Jason Statham",33,9);
		System.out.println();
		System.out.println();
		
		Employee e1 = new Employee(34,"Tom Cruise",102,2400,"Design Engineer");
		System.out.println();		
		System.out.println();
		
	}
}
		
