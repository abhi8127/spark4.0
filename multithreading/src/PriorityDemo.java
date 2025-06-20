class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
    }
}



public class PriorityDemo {
    public static void main(String[] args) {
        MyThread2 t2=new MyThread2();
        t2.setName("Thread t2");
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();

        MyThread2 t3=new MyThread2();
        t3.setName("Thread t3");
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();

    }
}
