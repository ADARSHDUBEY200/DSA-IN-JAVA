

public class _01_THREAD {

    static class MyThread extends Thread {
        
        public void run(){
            for(int i=0; i<1000; i++){
               System.out.println(getName() + " "+ i);
            }

             
        }

       
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t1.join();
        t2.start();

        
    }
}
