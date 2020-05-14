package JavaGda34.weekend10_TypyGeneryczne.zad1_Fruit;

import java.util.Random;

public class Apple extends Fruit {

    public Apple(final Double weight){
        super();
        this.weight=weight;
        this.color= new Random().nextBoolean() ? "GREEN" : "RED";
    }

}
