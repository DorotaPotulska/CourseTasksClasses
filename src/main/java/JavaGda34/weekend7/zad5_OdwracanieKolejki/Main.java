package JavaGda34.weekend7.zad5_OdwracanieKolejki;

import java.util.Deque;

public class Main {
    /**
     * Funkcja odwraca podaną kolejkę.
     *
     * Uwaga: wolno używać jedynie metod poll(), offer(), peek() i isEmpty()
     * oraz nie wolno tworzyć innych kolekcji.
     */
    public static void main(String[] args) {

    }
    public <T> void reverseQueue(Deque<T> queue) {
        T ostatniElement = queue.peek();
        while (!queue.poll().equals(ostatniElement)){
            queue.offer(queue.poll());
        }

    }
}
