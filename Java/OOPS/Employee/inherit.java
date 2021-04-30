import java.io.*;
class Employee
{
    String code, name, add, phno;
    float base,total,da,hra;
    void setdata() throws IOException
    {
        System.out.println("Enter Employee Code, Name, Address, Phone no, Base Salary");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        code=br.readLine();
        name=br.readLine();
        add=br.readLine();
        phno=br.readLine();
        base=Float.parseFloat(br.readLine());
        da=base/10;
        hra=base/5;
        total=base+da+hra;
    }
    void showdata()
    {
        System.out.println("Employee details");
        System.out.println(code+"\n"+name+"\n"+add+"\n"+phno+"\n"+base+"\n"+da+"\n"+hra+"\n"+total);
    }

}
class Teaching extends Employee
{
    String desig,special;
    void setattr() throws IOException
    {
        System.out.println("Enter special Attribute for teaching staff");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        desig=br.readLine();
        special=br.readLine();
    }
    void showdata()
    {
        System.out.println("Teaching details");
        System.out.println(code+"\n"+name+"\n"+desig+"\n"+special+"\n"+add+"\n"+phno+"\n"+base+"\n"+da+"\n"+hra+"\n"+total);
    }
}
class Office extends Employee
{
    String desig;
    void setattr() throws IOException
    {
        System.out.println("Enter special Attribute for Office staff");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        desig=br.readLine();
    }
    void showdata()
    {
        System.out.println("Teaching details");
        System.out.println(code+"\n"+name+"\n"+desig+"\n"+add+"\n"+phno+"\n"+base+"\n"+da+"\n"+hra+"\n"+total);
    }
}

class inherit
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Employee ob=new Employee();
        Teaching ob1=new Teaching();
        Office ob2=new Office();
        String s;
        System.out.println("Choose Employee, Teacher or office and garbage to exit");
        while(5!=0)
        {
            s=br.readLine();
            if(s.compareTo("Employee")==0)
            {
                try{
                ob.setdata();
                ob.showdata();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            if(s.compareTo("Teacher")==0)
            {
                try
                {
                ob1.setdata();
                ob1.setattr();
                ob1.showdata();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            else if(s.compareTo("Office")==0)
            {
                try
                {
                ob2.setdata();
                ob2.setattr();
                ob2.showdata();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            else
                break;
        }
    }
}