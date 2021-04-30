import java.io.*;
class newException extends Exception
{
    public String toString()
    {
        return "Divide by zero exception";
    }
}
class Exceptdemo 
{
    static float compute(float a,float b)throws newException
    {
        if(b==0)
        throw new newException();
        else
        return a/b;
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 2 numbers");
        float a,b,q=-1;
        a=Float.parseFloat(br.readLine());
        b=Float.parseFloat(br.readLine());
        try
        {
            q=compute(a,b);
        }
        catch(newException e)
        {
            System.out.println(e);
        }
        finally
        {
            if(q==-1)
                System.out.print("Error occured");
            else
                System.out.println(q);
        }
    }
}