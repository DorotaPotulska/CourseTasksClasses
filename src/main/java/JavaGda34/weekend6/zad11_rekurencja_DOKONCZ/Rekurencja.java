package JavaGda34.weekend6.zad11_rekurencja_DOKONCZ;

public class Rekurencja {
    public static void main(String[] args) {
        metodaA();
        //recursive();
    }
    public static void recursive(){
        System.out.println("Jestem w funcji rekurencyjnej");
        recursive();
    }
    public static void metodaA(){
        System.out.println("Jestem w metodzie A");
        metodaB();
        return;
    }

    public static void metodaB(){
        System.out.println("Jestem w metodzie B");
        return;
    }
}
///Exception in thread "main" java.lang.StackOverflowError
//bład dotyczący przepełnienia w stosie wywolan,skonczyła sie pamiec