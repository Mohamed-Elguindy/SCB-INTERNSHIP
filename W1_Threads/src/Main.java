//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // first way to create ur own thread
        MyThread Thread1 = new MyThread();

        // 2nd way
        MyRun run = new MyRun();
        Thread thread2 = new Thread(run);

        Thread1.start();
        try {
            Thread1.join(); // it makes thread 2 work after thread 1 die
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread1.isAlive());
        thread2.start();
    }
}