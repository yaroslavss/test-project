public class Loader {
    public static void main(String[] args) {
        ExampleThread t1 = new ExampleThread("t1");
        ExampleThread t2 = new ExampleThread("t2");

        t1.start();
        t1.setPriority(2);
        t2.start();
        t2.setPriority(8);

        System.out.println("1-st thread priority: " + t1.getPriority());
        System.out.println("2-nd thread priority: " + t2.getPriority());
    }
}

class ExampleThread extends Thread {
    public ExampleThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread is running... " + Thread.currentThread().getName());
    }
}