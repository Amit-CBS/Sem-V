class Prime
{
    public static void main(String args[])
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        for(int i=a;i<=b;i++)
        {
            int c=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                    c++;
            }
            if(c==1)
                System.out.println(i+" is Prime");
        }
    }
}