package JavaGda34.weekend11.zad1.threadsa.thrlocal;

import JavaGda34.weekend10_TypyGeneryczne.zad1_Fruit.Apple;
import JavaGda34.weekend10_TypyGeneryczne.zad1_Fruit.Fruit;

import java.util.Random;

public class ThreadLocalThreadExample implements Runnable {
    private  static ThreadLocal<Fruit>fruit=new ThreadLocal<>();
    @Override
    public void run() {
        final Fruit fruitFromThreadLocalBefore = fruit.get();
        System.out.println(fruitFromThreadLocalBefore);
        fruit.set(new Apple(new Random().nextDouble()));
        final Fruit fruitFromThreadLocalAfter = fruit.get();
        System.out.println(fruitFromThreadLocalAfter);
    }
}
