import java.util.*; 
public class Area
{
	public static void main(String args[])
	{
	    Scanner s = new Scanner(System.in);
        System.out.println("Enter the length:");
        double l = s.nextDouble();
        System.out.println("Enter the breadth:");
        double b = s.nextDouble();
	    Area obj = new Area(l,b);
	}
	Area(double l,double b)
	{
	    System.out.println("Area of rectangle = "+returnArea(l,b));
	}
	double returnArea(double x,double y)
	{   
		return (x*y);
	}
}
