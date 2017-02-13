class Node
{
	int data;
	Node next;

	public Node(int x,Node ref)
	{
		data=x;
		next=ref;
	}
	public Node(int x)
	{
		data=x;
	}
}
class LinkedList
{
	Node start;
	public LinkedList(){
		//TODO
	}
	public void insbeg(int x)
	{
		Node tmp=new Node(x,start);
		start=tmp;
	}
	public int delbeg()
	{
		if(start==null)
		{
			System.out.println("Stack is underflow");
			return 0;
		}
		else
		{
		Node tmp=start;
		start=tmp.next;
		return tmp.data;
		}
	}
	public void display()
	{
		Node p=start;
		while(p!=null)
		{
			System.out.println(""+p.data);
			p=p.next;
		}
	}
}
public class Class4
{
	public static void main(String args[])
	{
		LinkedList l1=new LinkedList();
		l1.insbeg(10);
		l1.insbeg(20);
		l1.insbeg(30);
		l1.display();
		l1.delbeg();
		l1.delbeg();
		l1.delbeg();
		l1.delbeg();
		l1.display();
	}
}

