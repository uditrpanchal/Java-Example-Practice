abstract class Shapes
{	
	int p,q,r,s;
	//double area,perimeter;
	public Shapes(int a,int b,int c,int d)
	{
		p = a;
		q = b;
		r = c;
		s = d;
	}

	abstract public void area();

	abstract public void perimeter();

	abstract public void print();
}

class Square extends Shapes
{
	double area,perimeter;
	public Square(int a)
	{
		super(a,0,0,0);
	}

	public void area()
	{
		area = p*p;
		//System.out.println("Area of Square is : "+area);
	}

	public void perimeter()
	{
		perimeter = 4*p;
		//System.out.println("Perimeter of Square is : "+perimeter);
	}

	public void print()
	{
		System.out.println("Area of Square : "+area+", Perimeter of Square : "+perimeter);
	}
}

class Circle extends Shapes
{
	double area,perimeter;
	public Circle(int r)
	{
		super(r,0,0,0);
	}

	public void area()
	{
		area = 3.14*p*p;
		//System.out.println("Area of Circle is : "+area);
	}

	public void perimeter()
	{
		perimeter = 2*3.14*p;
		//System.out.println("Perimeter of the Circle is : "+perimeter);
	}

	public void print()
	{
		System.out.println("Area of Circle : "+area+", Perimeter of Circle : "+perimeter);
	}
}

class Triangle extends Shapes
{
	double area,perimeter;	
	public Triangle(int a,int b,int c,int height)
	{
		super(a,b,c,height);
	}

	public void area()
	{
		area = 0.5*r*s;
		//System.out.println("Area of the shape is : "+area);
	}

	public void perimeter()
	{
		perimeter = p+q+r;
		//System.out.println("Perimeter of the shape is : "+perimeter);
	}

	public void print()
	{
		System.out.println("Area of Triangle : "+area+", Perimeter of Triangle : "+perimeter);
	}
}
public class Inher5
{
	public static void main(String[] args)
	{
		Shapes s1,s2,s3;
/*
		s1 = new Shapes(5,0,0,0);
		s2 = new Shapes(4,0,0,0);
		s3 = new Shapes(2,3,4,5);
*/
		s1 = new Square(5);
		s2 = new Circle(4);
		s3 = new Triangle(2,3,4,5);

		s1.area();
		s1.perimeter();
		s1.print();

		s2.area();
		s2.perimeter();
		s2.print();

		s3.area();
		s3.perimeter();
		s3.print();

	}
}
