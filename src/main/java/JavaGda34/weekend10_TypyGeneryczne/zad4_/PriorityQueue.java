package JavaGda34.weekend10_TypyGeneryczne.zad4_;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class PriorityQueue<V,P extends Comparable<P>>extends AbstractQueue<V> {
    private LinkedList<PriorityElement<V,P>> elements = new LinkedList<>();

    private final P defaultPriority;

    public PriorityQueue(final P defaultPriority) {
        this.defaultPriority = defaultPriority;
    }


    @Override
    public Iterator<V> iterator() {
        return elements.stream()
                .map(elements->elements.getValue())
                .collect(Collectors.toList())
                .iterator();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean offer(final V v) {
        return offer(v, defaultPriority);
    }

    public boolean offer(final V v, final P priority) {

        if(elements.isEmpty()){
            elements.add(new PriorityElement<>(v,priority));
            return true;
        }

        final int beforeSize = elements.size();
        for (int i = 0; i < elements.size(); i++) {
            if(priority.compareTo(elements.get(i).getPriority())>0){
                elements.add(i,new PriorityElement<>(v,priority));
                return true;
            }
        }
        //if(beforeSize==elements.size()){
            elements.addLast(new PriorityElement<>(v,priority));
        //}
        return true;
    }

    @Override
    public V poll() {
        return elements.poll().getValue();
    }

    @Override
    public V peek() {
        return elements.peek().getValue();
    }
}
