public class main
{
	public static void main(String args[])
	{
		Testclass obj=new Testclass();
		obj.Area( 4);
		obj.Area(5,4);
	}
}
class Testclass
{
	void Area(int r)
	{
		System.out.println("Area of circle    = "+ (3.14*r*r)+"sq.units");
	}
	void Area(int l,int b)
	{
		System.out.println("Area of rectangle = "+(l*b)+"sq.units");
	}
}
