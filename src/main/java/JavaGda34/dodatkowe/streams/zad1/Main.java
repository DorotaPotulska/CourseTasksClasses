package JavaGda34.dodatkowe.streams.zad1;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Integer> iterate = Stream.iterate(1,n->n+1);
        iterate.forEach(n-> System.out.println(n));
    }
}
