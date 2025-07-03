public class MyThread extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Thread 1 :"+i+" s");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Failed to sleep");
            }
        }
        System.out.println("Thread 1 finished");
    }
}
