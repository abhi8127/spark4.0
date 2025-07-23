package sync;

public class TestSync {
    public static void main(String[] args) {
        System.out.println("...................sync method...................");
        TablePrntWithBlock t=new TablePrntWithBlock();
        MyThread1 t1=new MyThread1(t);
        Thread t2=new MyThread1(t);

        t1.setName("t1-thread");
        t2.setName("t2-thread");

        t1.start();
        t2.start();

        try
        {
            System.out.println("Main thread waiting....");
            t1.join();
            t2.join();
            System.out.println("Main thread completed");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
