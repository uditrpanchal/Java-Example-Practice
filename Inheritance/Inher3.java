class Shapes
{	
	int p,q,r,s;
	double area,perimeter;
	public Shapes(int a,int b,int c,int d)
	{
		p = a;
		q = b;
		r = c;
		s = d;
	}

	public void area()
	{
		area = 0;
		
	}

	public void perimeter()
	{
		perimeter = 0;
		
	}

	public void print()
	{
		System.out.println("Area of given shape : "+area+", Perimeter of given shape : "+perimeter);
	}

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
		
	}

	public void perimeter()
	{
		perimeter = 4*p;
		
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
		
	}

	public void perimeter()
	{
		perimeter = 2*3.14*p;
		
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
		
	}

	public void perimeter()
	{
		perimeter = p+q+r;
		
	}

	public void print()
	{
		System.out.println("Area of Triangle : "+area+", Perimeter of Triangle : "+perimeter);
	}
}
public class Inher3
{
	public static void main(String[] args)
	{
		Shapes s1,s2,s3;
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
