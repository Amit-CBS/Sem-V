class Sorting
{
    public static void main(String args[])
    {
        int n=args.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (Integer.parseInt(args[i]) > Integer.parseInt(args[j])) 
                {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(args[i] + ", ");
        }
        System.out.println(args[n - 1]);
    }
}