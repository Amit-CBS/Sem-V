class Circle
{
	double R;
	Circle(double r)
	{
		R=r;
	}
	double Perimeter()
	{
		return 3.14*R*2;
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
	double Perimeter()
	{
		return (2*(L+B));
	}
}
class Square
{
	double L;
	Square(double l)
	{
		L=l;
	}
	double Perimeter()
	{
		return 4*L;
	}
}
class Perimeter
{
	public static void main(String[] args)
	{

		for (int i=0;i<args.length;i++)
		{
			if(args[i].equalsIgnoreCase("Circle"))
			{
				Circle c=new Circle(Double.parseDouble(args[++i]));
				System.out.println("Perimeter of Circle = "+c.Perimeter());
			}
			if(args[i].equalsIgnoreCase("Rectangle"))
			{
				Rectangle r=new Rectangle(Double.parseDouble(args[++i]),Double.parseDouble(args[++i]));
				System.out.println("Perimeter of Rectangle = "+r.Perimeter());

			}
			if(args[i].equalsIgnoreCase("Square"))
			{
				Square s=new Square(Double.parseDouble(args[++i]));
				System.out.println("Perimeter of Square = "+s.Perimeter());
			}

		}
	}
}