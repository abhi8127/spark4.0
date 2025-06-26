class MyThread3 extends Thread{
    int sum=0;

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

public class Problem {
    public static void main(String[] args) {
      /* MyThread3 t1=new MyThread3();   // both object are different so there is no chance of race condition
        MyThread3 t2=new MyThread3();
        t1.start();
        t2.start();
       */

        MyThread3 obj = new MyThread3();       //  Shared object
        Thread t1 = new Thread(obj);           // Thread-1 using same object
        Thread t2 = new Thread(obj);           //  Thread-2 using same object
        t1.start();
        t2.start();

        /*
        so in this there is race condition
         */

    }
}
