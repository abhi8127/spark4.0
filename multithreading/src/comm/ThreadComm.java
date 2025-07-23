package comm;

public class ThreadComm {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a1=new ThreadA();
        a1.start();

        synchronized(a1)
        {
            System.out.println("main thread calling wait()");
            a1.wait();


            System.out.println("main thread get notify....");
            System.out.println("total : "+a1.total);
        }
    }

}

class ThreadA extends Thread{
    int total=0;
    @Override
    public void run() {

        synchronized (this)
        {
            System.out.println("Child thread start calculation");
            for(int i=0;i<=100;i++)
            {
                total=total+i;
            }
            this.notify();
            System.out.println("Child thread giving notification");
        }
    }
}
