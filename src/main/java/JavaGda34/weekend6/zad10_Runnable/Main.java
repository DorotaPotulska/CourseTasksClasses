package JavaGda34.weekend6.zad10_Runnable;

public class Main {
    public static void main(String[] args) {
        Runnable uruchamialna = new Runnable(){
            @Override
            public void run() {
                try{

                    for(int i=0;i<=100;i++){
                        System.out.println(i);
                        Thread.sleep(100);
                    }

                }catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        /*Runnable uruchamialna2 = new Runnable(){
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
        };*/

        Thread watek = new Thread(uruchamialna);
        //Thread watek2 = new Thread(uruchamialna2);
        Thread watek2 = new Thread(new MyRun());
        watek.start();
        watek2.start();

        Thread watek3=new MyThread();
        watek3.start();
    }
}
