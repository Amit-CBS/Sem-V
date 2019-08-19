class Ref
{

    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        System.out.println("Before call: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        show(arr);
        System.out.println("After call: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static void show(int n[])
    {
        for(int i=0;i<n.length;i++)
            n[i]+=2;
        System.out.println("After call: ");
        for (int i = 0; i < n.length; i++)
            System.out.print(n[i] + " ");
        System.out.println();
    }
}