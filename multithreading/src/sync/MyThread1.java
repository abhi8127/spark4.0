package sync;

public class MyThread1 extends Thread{
    TablePrntWithBlock t1;
    MyThread1(TablePrntWithBlock t)
    {
        this.t1=t;
    }

    @Override
    public void run() {
        t1.printTable(5);
    }

}
