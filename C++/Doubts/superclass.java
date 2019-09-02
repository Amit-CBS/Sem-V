public class superclass 
{
    int num=2;
    public static void main(String str[])
    {
        superclass s=new sub();
        //HERE: nothing changes if we write, sub s=new sub();
        s.supermethod();
        s.method();
    }
    void supermethod()
    {
        System.out.println("supermethod as in superclass");
    }
    void method()
    {
        System.out.println("num in superclass "+num);
    }
}
class sub extends superclass
{
    int num=5;
    void method()
    {
        System.out.println("num is sub class "+num);
    }
    void supermethod()
    {
        System.out.println("changed supermethod in sub class");
    }
}