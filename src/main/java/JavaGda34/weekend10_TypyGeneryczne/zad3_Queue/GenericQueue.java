package JavaGda34.weekend10_TypyGeneryczne.zad3_Queue;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<T> extends AbstractQueue<T>/*implements Queue<T>*/ {

    private LinkedList<T> elements=new LinkedList<>();
    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean offer(final T t) {
       // elements.offer(t)
        return elements.add(t);
    }

    @Override
    public T poll() {
        //elements.poll();
        return elements.remove();
    }

    @Override
    public T peek() {
        return elements.peek();
    }
}
