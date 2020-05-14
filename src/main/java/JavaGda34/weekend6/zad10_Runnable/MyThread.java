package JavaGda34.weekend6.zad10_Runnable;

public class MyThread extends Thread{

    @Override
    public synchronized void run(){

        try {

            for(int i=0; i<20;i++) {
                System.out.println("Jestem osobnym watkiem");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
