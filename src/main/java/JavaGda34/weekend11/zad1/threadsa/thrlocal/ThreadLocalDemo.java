package JavaGda34.weekend11.zad1.threadsa.thrlocal;

public class ThreadLocalDemo {
    public static void main(String[] args) throws InterruptedException {
        final Thread threadA= new Thread(new ThreadLocalThreadExample());
        final Thread threadB= new Thread(new ThreadLocalThreadExample());

        threadA.start();
        threadA.sleep(500L);
        threadB.start();

        threadA.join();
        threadB.join();


    }
}
