package task8;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BoundedWaitList<E> extends WaitList{
    private int capacity;


    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
        queue = new ArrayDeque<>(capacity);
    }
    public int getCapacity(){
        return capacity;
    }

    @Override
    public void add(Object element) {
        if (queue.size() < capacity)
            queue.add(element);
        else
            System.out.println("Невозможно добавить элемент, очередь заполнена");
    }

    @Override
    public String toString() {
        return "BoundedWaitList {" +
                "capacity=" + capacity +
                "} " + super.toString();
    }
}
