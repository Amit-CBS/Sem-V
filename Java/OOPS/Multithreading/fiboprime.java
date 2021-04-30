import java.io.*;
class fibo implements Runnable
{
    Thread t;
    static int i,a=0,b=1,temp,n;
    public fibo(int n)
    {
        this.n=n;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        System.out.println("Fibonacci thread");
        try
        {
            System.out.println("Fibonacci term"+a+"\nFibonacci Term "+b);
            for(i=0;i<n-2;i++)
            {
                temp=a+b;
                a=b;
                b=temp;
                System.out.println("Fibonacci Term"+temp);
                t.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Exiting Fibonacci Thread");
    }
}
class prime implements Runnable
{
    Thread t;
    int i,j,n,flag;
    public prime(int n)
    {
        this.n=n;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        System.out.println("Prime thread");
        try
        {
            for(i=1;i<=n;i++)
            {
                flag=0;
                for(j=2;j<n;j++)
                {
                    if(i%j==0)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                {
                    System.out.println("Prime Term "+i);
                    t.sleep(500);
                }
                
            }
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Exiting Prime Thread");
    }
}

class fiboprime
{
    public static void main(String[] args) throws IOException
    {
        Thread.currentThread().setPriority(10);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter No of terms");
        int n=Integer.parseInt(br.readLine());
        fibo ob=new fibo(n);
        prime ob2=new prime(n);
        try
        {
            ob.t.join();
            ob2.t.join();
        }
        catch(Exception e)
        {
            System.out.println("Exception caught: "+e);
        }
    }
}