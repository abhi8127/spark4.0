class YieldThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName()+"......"+i);
            Thread.yield();
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {
        YieldThread yt1=new YieldThread();
        YieldThread yt2=new YieldThread();

        yt1.start();
        yt2.start();

    }
}
