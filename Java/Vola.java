import java.io.*;
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
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("For Cube: ");
		System.out.print("\tEnter side: ");
		double l=Double.parseDouble(br.readLine());

		System.out.println("For Cylinder: ");
		System.out.print("\tEnter radius: ");
		double r=Double.parseDouble(br.readLine());
		System.out.print("\tEnter height: ");
		double h=Double.parseDouble(br.readLine());

		System.out.println("For Ellipsoid: ");
		System.out.print("\tEnter side a: ");
		double a=Double.parseDouble(br.readLine());
		System.out.print("\tEnter side b: ");
		double b=Double.parseDouble(br.readLine());
		System.out.print("\tEnter side c: ");
		double c=Double.parseDouble(br.readLine());

		System.out.println("Volume of Cube = "+volume(l));
		System.out.println("Volume of Cylinder = "+volume(r,h));
		System.out.println("Volume of Ellipsoid = "+volume(a,b,c));
	}
}