package Java_Thread;

public class thread1 extends Thread {

    @Override
    public void run()
    {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        thread1 thread = new thread1();
        thread.start();
    }
}
