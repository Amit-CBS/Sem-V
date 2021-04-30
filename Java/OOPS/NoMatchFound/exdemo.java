import java.io.*;
class MyException extends Exception
{
    String s;
    MyException(String s)
    {
        this.s=s;
    }
    public String toString()
    {
        return "My Exception ["+s+"] not present";
    }
}

class ExceptionDemo
{
    static void check(String s, String city[]) throws MyException
    {
        int i,f=0;
        for(i=0;i<city.length;i++)
        {
            if(s.compareTo(city[i])==0)
                f=1;
        }
        if(f==0)
            throw new MyException(s);
        else
            System.out.println("Normal Exit");
    }
    public static void main(String args[]) throws IOException
    {
        String city[];
        System.out.println("Enter No of cities");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,k,n;
        n=Integer.parseInt(br.readLine());
        city=new String[n];
        System.out.println("Enter cities");
        for(i=0;i<n;i++)
            city[i]=br.readLine();

        try
        {
            check("Kolkata",city);    
        }catch(MyException e)
        {
            System.out.println("Caught "+e);
        }
    }
}