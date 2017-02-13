abstract class Stack
{
	int top,size,max = 7;
	int arr[];
	Stack()
	{
		top = -1;
		size = max;
		arr = new int[max];
	}

	abstract public void push(int val);
	abstract public int pop();
	abstract public void display();
}

class StackOper extends Stack
{
	public void push(int val)
	{
		if(top == 7)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			arr[++top] = val;
			System.out.println(val+" is added to stack");
		}
	}

	public int pop()
	{
		return arr[top--];
	}

	public void display()
	{
		System.out.println("\nStack Contents : \n");
		for(int i = top; i>=0; i--)
		{
			System.out.println(""+arr[i]);
		}
		System.out.println();
	}
}


	
public class Class3
{
	public static void main(String[] args)
	{
		Stack ss = new StackOper();

		int x;

		ss.push(10);
		ss.push(20);
		ss.push(30);
		ss.display();
		
		x = ss.pop();
		System.out.println(x+" deleted from Stack");
		ss.display();
		
		ss.push(40);
		ss.push(50);
		ss.push(60);
		ss.display();

		x = ss.pop();
		System.out.println(x+" deleted from Stack");
		x = ss.pop();
		System.out.println(x+" deleted from Stack");
		x = ss.pop();
		System.out.println(x+" deleted from Stack");
		ss.display();
		
		ss.push(70);
		ss.push(80);
		ss.push(90);
		ss.display();

	}
}
