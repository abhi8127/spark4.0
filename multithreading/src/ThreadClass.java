
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("mera thread");
        System.out.println(Thread.currentThread().getName());

        MyThread1 t=new MyThread1();
        t.start();

       t.setName("child thread");
       System.out.println("after changing the name of thread");
       //t.start();  // A Thread object in Java can be started only once.
        MyThread1 t2=new MyThread1();
        t2.start();

    }
}
