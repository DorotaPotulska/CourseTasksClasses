package JavaGda34.weekend10_TypyGeneryczne.zad1_Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitBox<F extends Fruit> {

    private List<Fruit> fruits = new ArrayList<>();
    /*List.of ,Collections.emptyList() - wersje listy IMMUTABLE-> add nie działa*/

    public void addFruitToBox(final F fruit){
        fruits.add(fruit);

    }

    public void removeRotten(){
        fruits= fruits.stream()
                .filter(fruit -> !fruit.isRotten())
                .collect(Collectors.toList());
    }

    public Double getTotalWeight(){
        return fruits.stream()
                //.mapToDouble(fruit->fruit.getWeight())
                .mapToDouble(Fruit::getWeight)
                .sum();
    }
}
