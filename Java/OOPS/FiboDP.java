import java.sql.Timestamp;
import java.util.Date;
class FiboDP
{
    static int fibN(int n)
    {
        int result;
        if (n==1 || n==2)
            result=1;
        else
            result=fibN(n-1)+fibN(n-2);
        return result;
    }
    static int fib_2(int n, int memo[])
    {
        int result;
        if(memo[n]!=0)
            return memo[n];
        if(n==1 || n==2)
            result = 1;
        else
            result=fib_2(n-1, memo)+fib_2(n-2, memo);
        memo[n]=result;
        return result;
    }
    static int fibM(int n)
    {
        int memo[]=new int[n+1];
        // memo = [None] * (n + 1);
        return fib_2(n, memo);
    }
    static int fibBU(int n)
    {
        if(n==1 || n==2)
            return 1;
        int bottom_up[]=new int[n+1];
        // bottom_up = [None] * (n+1)
        bottom_up[1]=1;
        bottom_up[2]=1;
        for(int i=3;i<n+1;i++)
            bottom_up[i] = bottom_up[i-1] + bottom_up[i-2];
        return bottom_up[n];
    }
    public static void main(String args[])
    {
        Date date1=new Date();
        long time1=date1.getTime();
        Timestamp ts1=new Timestamp(time1);
        System.out.println(ts1);
        
        System.out.println("\tNaive 35th Fibo is "+fibN(35));

        Date date2=new Date();
        long time2=date2.getTime();
        Timestamp ts2=new Timestamp(time2);
        System.out.println(ts2);
        
        System.out.println("\tMemoized 35th Fibo is "+fibM(35));

        Date date3=new Date();
        long time3=date3.getTime();
        Timestamp ts3=new Timestamp(time3);
        System.out.println(ts3);
        
        System.out.println("\tBottomUp 35th Fibo is "+fibBU(35));

        Date date4=new Date();
        long time4=date4.getTime();
        Timestamp ts4=new Timestamp(time4);
        System.out.println(ts4);
    }
}