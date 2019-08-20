class Volume
{
	static double volume(double a, double b ,double c)
	{
		return (4/3.0*3.14*a*b*c);
	}
	static double volume(double r, double h)
	{
		return 3.14*r*r*h;
	}
	static double volume(double l)
	{
		return l*l*l;
	}
	public static void main(String[] args)
	{
		for (int i=0;i<args.length;i++)
		{
			if(args[i].equalsIgnoreCase("Cube"))
			{
				double l=Double.parseDouble(args[++i]);
				System.out.println("Volume of Cube = "+volume(l));
			}
			if(args[i].equalsIgnoreCase("Cylinder"))
			{		
				double r=Double.parseDouble(args[++i]);
				double h=Double.parseDouble(args[++i]);
				System.out.println("Volume of Cylinder = "+volume(r,h));
			}
			if(args[i].equalsIgnoreCase("Ellipsoid"))
			{		
				double a=Double.parseDouble(args[++i]);
				double b=Double.parseDouble(args[++i]);
				double c=Double.parseDouble(args[++i]);
				System.out.println("Volume of Ellipsoid = "+volume(a,b,c));
			}

		}
	}
}