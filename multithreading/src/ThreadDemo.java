class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++)
        {
            System.out.println("child Thread");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread t1= new MyThread();
        //t1.start(); the run() method would execute on the main thread, not in a new thread.
        t1.run();
        for(int i=0;i<6;i++)
        {
            System.out.println("Main Thread");
        }


    }
}
