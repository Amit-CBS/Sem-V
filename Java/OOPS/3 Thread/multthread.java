class multhd implements Runnable
{
    long click=0;
    Thread t;
    private volatile boolean running=true;
    public multhd(int p)
    {
        t= new Thread(this);
        t.setPriority(p);
        t.start();
    }
    public void run()
    {
        System.out.print("Current thread running is "+t);
        while(running)
        System.out.println(click++);
    }
    public void stop()
    {
        running=false;
    }
}
class multthread 
{
    public static void main(String[] args) 
    {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        multhd th1= new multhd(7), th2= new multhd(5), th3=new multhd(3);
        try
        {
            System.out.println("sleeping main thread");
            Thread.sleep(1000);    
        }catch(Exception e)
        {
            System.out.println("Interrupted : "+e);
        }
         th1.stop();
         th2.stop();
         th2.stop();
        try{
            th1.t.join();
            th2.t.join();
            th3.t.join();
        }
        catch(Exception e)
        {
            System.out.println(" Interrupted "+e);
        }
        System.out.println("Thread1: "+th1.click);
        System.out.println("Thread2: "+th2.click);
        System.out.println("Thread3: "+th3.click);
    }
}