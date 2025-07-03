public class MyRun implements Runnable{ // THIS WAY IS BETTER IF U NEED TO EXTEND IT FROM ANIOTHER CLASS
    @Override
    public void run() {
        for(int i=10;i>=0;i--){
            System.out.println("Thread 2 :"+i+" s");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Failed to sleep");
            }
        }
        System.out.println("Thread 2 finished");
    }

}
