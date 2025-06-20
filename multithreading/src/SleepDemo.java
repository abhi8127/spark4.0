class SleepThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++)
        {
            System.out.println(getName()+"----"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("thread interupted");
            }
        }
    }
}



public class SleepDemo{
    public static void main(String[] args) {
    SleepThread t1=new SleepThread();
    t1.setName("child");
    t1.start();
    }
}
