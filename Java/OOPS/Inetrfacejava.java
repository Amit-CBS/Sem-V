import java.io.*;

interface myiface
{
    
    void involume(float a, float b, float c);
    void outvolume(float s1, float s2, float s3);
}

class volume implements myiface
{
    public void involume(float a,float b, float c)
    {
        System.out.println("Involume:= "+(1f/3)*a*b*c);
    }
    public void outvolume(float a, float b, float c)
    {
        System.out.println("Outvolume:= "+(4f/3)*a*b*c);
    }
}

class iface
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        float a,b,c;
        a=Float.parseFloat(br.readLine());
        b=Float.parseFloat(br.readLine());
        c=Float.parseFloat(br.readLine());
        volume ob=new volume();
        ob.involume(a, b, c);
        ob.outvolume(a, b, c);
    }
}