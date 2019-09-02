class StaticVar
{
    static int a=0;
    public static void main(String[] args)
    {
        StaticVar ob1=new StaticVar();
        StaticVar ob2=new StaticVar();
        a=5;
        System.out.println("static a="+a);
        System.out.println("ob1.a="+ob1.a);
        System.out.println("ob2.a="+ob2.a);
        ob1.a=10;
        System.out.println("\nstatic a="+a);
        System.out.println("ob1.a="+ob1.a);
        System.out.println("ob2.a="+ob2.a);

    }
}