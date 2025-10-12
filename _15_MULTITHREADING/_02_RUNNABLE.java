

public class _02_RUNNABLE {

    static class Mythread implements Runnable {
        public void run (){
            for(int i=0 ; i<1000; i++){
                System.out.println("THIS IS THE THREAD CALLED : " + Thread.currentThread().getName());
            }
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Mythread obj = new Mythread();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

       t1.setName("THIS IS MY FIRST THREAD : ");
       t2.setName("THIS IS MY SECOND THREAD : ");
       t1.start();
       t1.sleep(100);
       t2.start();
    }
}
