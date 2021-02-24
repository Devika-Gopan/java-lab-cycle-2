import java.util.*;
class javaarea
{
	public static void main(String args[])
	{
		demo obj = new demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length & breadth of rectangle : ");
		int ln = sc.nextInt();
		int bd = sc.nextInt();
		System.out.println("Enter the radius of circle : ");
		Double rd = sc.nextDouble();
		obj.areamethod(ln,bd);
		obj.areamethod(rd);
		
	}
}
class demo
{
	void areamethod(int l,int b)
	{
		int area;
		area =l*b;
		System.out.println("Area of rectangle = "+area);
		
	}
	void areamethod(double r)
	{
		double area;
		area = 3.14*r*r;
		System.out.println("Area of circle = "+area);
	}
}
