package JavaGda34.weekend6.zad10_Runnable;

public class MyRun implements Runnable {

    @Override
    public void run() {
        try{

            for(int i=100;i>=0;i--){
                System.out.println(i);
                Thread.sleep(10);
            }

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
