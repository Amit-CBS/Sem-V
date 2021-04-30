import java.io.*;
import MyPack.*;
class callfn
{
    public static void main(String args[]) throws IOException
    {
        int a,b,c;
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Figure ob=new Figure();
        System.out.println("enter shape name to calculate in lowercase and their requied parameters");
        s=br.readLine();
        if(s.compareTo("cube")==0)
            {
                a=Integer.parseInt(br.readLine());
                ob.volume(a);
            }
        else if(s.compareTo("rectangle")==0)
        {
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            c=Integer.parseInt(br.readLine());
            ob.volume(a,b,c);
        }
        else if(s.compareTo("cyllinder")==0)
        {
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            ob.volume(a,b);
        }
    }
}