import java.io.*;
class initialize
{
    int ar[]=new int[5],i;
    initialize()
    {
        for(i=0;i<5;i++)
            ar[i]=(i+1)*10;
        sort();
    }
    initialize(int ar[])
    {
        for(i=0;i<5;i++)
            this.ar[i]=ar[i];
        sort();
    }

    void sort()
    {
        System.out.println("Sorted Data is\n\n");
        int j,temp;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5-1-i;j++)
            {
                if(ar[j+1]>ar[j])
                {
                    temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(i=0;i<5;i++)
            System.out.print(ar[i]+"  ");
    }
}

class overloadsort
{
    public static void main(String args[]) throws IOException
    {
        initialize ab;
        int ar[]=new int[5],i,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 integers, 0 to initialize default");
        for(i=0;i<5;i++)
        {
            j=Integer.parseInt(br.readLine());
            if(j==0)
            {
                ab=new initialize();
                break;
            }
            ar[i]=j;
        }
        ab=new initialize(ar);
    }
}