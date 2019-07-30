class Fibo
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]), f=0, s=1, nxt;
        System.out.print("First "+n+" terms of Fibonacci Series are: ");
        for(int i=1;i<=n;i++)
        {
            if(i<=2)
                nxt=i-1;
            else
            {
                nxt=f+s;
                f=s;
                s=nxt;
            }
            System.out.print(nxt+" ");
        }
        System.out.println();
    }
}