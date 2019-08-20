import java.io.*;
class Circle
{
	double R;
	Circle(double r)
	{
		R=r;
	}
	double Area()
	{
		return 3.14*R*R;
	}
}
class Rectangle
{
	double L, B;
	Rectangle(double l, double b)
	{
		L=l;
		B=b;
	}
	double Area()
	{
		return L*B;
	}
}
class Square
{
	double L;
	Square(double l)
	{
		L=l;
	}
	double Area()
	{
		return L*L;
	}
}
class Area
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("For Circle: ");
		System.out.print("\tEnter radius: ");
		double R=Double.parseDouble(br.readLine());

		System.out.println("For Rectangle: ");
		System.out.print("\tEnter length: ");
		double l=Double.parseDouble(br.readLine());

		System.out.print("\tEnter breadth: ");
		double b=Double.parseDouble(br.readLine());

		System.out.println("For Square: ");
		System.out.print("\tEnter side: ");
		double a=Double.parseDouble(br.readLine());

		Circle c=new Circle(R);
		Rectangle r=new Rectangle(l,b);
		Square s=new Square(a);
		System.out.println("Area of Circle = "+c.Area());
		System.out.println("Area of Rectangle = "+r.Area());
		System.out.println("Area of Square = "+s.Area());
	}
}