class parent
{
	void printparent()
	{
		System.out.println("This is parent class");
	}
}
class child extends parent
{
	void printchild()
	{
		System.out.println("This is child class");
	}
}
public class DemoInheritance
{
	public static void main(String[] args)
	{
		
		child c=new child();
		parent p=new parent();
		p.printparent();
		c.printchild();
		c.printparent();
	}
}
