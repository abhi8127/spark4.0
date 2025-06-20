class JoinThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName());
        }
    }
}


public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
  JoinThread t1=new JoinThread();
  t1.start();
  t1.join();//Main thread would wait until t1 completely finishes,
        // and only then start printing "main thread"
  for(int i=0;i<6;i++)
  {
      System.out.println("main thread");
  }
    }
}
