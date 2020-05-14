package JavaGda34.weekend10_TypyGeneryczne.zad1_Fruit;

public class FruitDemo {
    public static void main(String[] args) {
        final Fruit apple=new Apple(1.2);
        final Fruit banana=new YellowBanana(2.2);
        final Fruit grapefruit = new MagicalGrapefriut(5000.0);

        final FruitBox<Apple> aplleFriutBox = new FruitBox<>();

        final FruitBox<Fruit> fruitBox = new FruitBox<>();

        fruitBox.addFruitToBox(apple);
        fruitBox.addFruitToBox(banana);
        fruitBox.addFruitToBox(grapefruit);

        System.out.println(fruitBox.getTotalWeight());

        fruitBox.removeRotten();

        System.out.println(fruitBox.getTotalWeight());

    }
}
