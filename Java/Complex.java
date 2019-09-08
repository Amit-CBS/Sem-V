import java.io.*;
class Complex
{
    double real, img;
    Complex()
    {
        real = 1;
        img = 2;
    }
    Complex(Complex ob)
    {
        real = ob.real;
        img = ob.img;
    }
    Complex(double r, double i)
    {
        real = r;
        img = i;
    }
    public static Complex sum(Complex c01, Complex c02)
    {
        Complex temp = new Complex(0, 0);
        temp.real = c01.real + c02.real;
        temp.img = c01.img + c02.img;
        return temp;
    }
    public static Complex diff(Complex c01, Complex c02)
    {
        Complex temp = new Complex(0, 0);
        temp.real = c01.real - c02.real;
        temp.img = c01.img - c02.img;
        return temp;
    }
    public static Complex mul(Complex c01, Complex c02)
    {
        Complex temp = new Complex(0, 0);
        temp.real = c01.real * c02.real - c01.img * c02.img;
        temp.img = c01.real * c02.img + c01.img * c02.real;
        return temp;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Menu:\n\t1. Non Parameterized constructor\n\t2. Parameterized Constructor\n\t3. Passing object\nEnter your choice: ");
        int p = Integer.parseInt(br.readLine());
        Complex c1, c2, c3, c4, c5;
        switch (p)
        {
            case 1:
                c1 = new Complex();
                c2 = new Complex();
                c3 = sum(c1, c2);
                System.out.println("Sum=" + c3.real + "+" + c3.img + "i");
                c3 = diff(c1, c2);
                System.out.println("Diff=" + c3.real + "+" + c3.img + "i");
                c3 = mul(c1, c2);
                System.out.println("Mul=" + c3.real + "+" + c3.img + "i");
                break;
            case 2:
                System.out.println("Enter 2 numbers (real then imaginary part): ");
                c1 = new Complex(Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine()));
                System.out.println("Enter 2 numbers (real then imaginary part): ");
                c2 = new Complex(Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine()));
                c3 = sum(c1, c2);
                System.out.println("Sum=" + c3.real + "+" + c3.img + "i");
                c3 = diff(c1, c2);
                System.out.println("Diff=" + c3.real + "+" + c3.img + "i");
                c3 = mul(c1, c2);
                System.out.println("Mul=" + c3.real + "+" + c3.img + "i");
                break;
            case 3:
                System.out.println("Enter 2 numbers (real then imaginary part): ");
                c1 = new Complex(Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine()));
                System.out.println("Enter 2 numbers (real then imaginary part): ");
                c2 = new Complex(Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine()));
                c4 = new Complex(c1);
                c5 = new Complex(c2);
                c3 = sum(c4, c5);
                System.out.println("Sum=" + c3.real + "+" + c3.img + "i");
                c3 = diff(c4, c5);
                System.out.println("Diff=" + c3.real + "+" + c3.img + "i");
                c3 = mul(c4, c5);
                System.out.println("Mul=" + c3.real + "+" + c3.img + "i");
                break;
            default:
                System.out.println("\nInvalid choice");
        }
    }
}