class Asc
{
    public static void main(String args[])
    {
        int n=args.length, a[]=new int[100];
        for (int i = 0; i < n; i++) 
        {
            a[i]=Integer.parseInt(args[i]);
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[n - 1]);
    }
}