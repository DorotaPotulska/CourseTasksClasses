package JavaGda34.dodatkowe.streams.zad2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Dorota","Paweł","Wojtek","Karolina");
        Stream<String> stream1 = names.stream();
        /*Stream<String>stream2= stream1.filter(new Predicate<String>() {
            @Override
            public boolean test(final String s) {
                return s.endsWith("a");
            }
        });*/

       /* Stream<String>stream2= stream1.filter(s->s.endsWith("a"));

        stream2.forEach(n-> System.out.println(n));*/

        names.stream()
                .filter(n->n.endsWith("a"))
                .forEach(System.out::println);

        List<String> filteredNames = names.stream()
                .filter(n -> n.endsWith("a"))
                .collect(Collectors.toList());
    }
}
