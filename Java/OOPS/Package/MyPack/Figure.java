package MyPack;
public class Figure
{
    public void volume(int a)
    {
       System.out.print(a*a*a);
    } 
    public void volume(int a, int b, int c)
    {
        System.out.print(a*b*c);
    }
    public void volume(int a, int b)
    {
        System.out.print((22f/7)*a*a*b);
    }
}