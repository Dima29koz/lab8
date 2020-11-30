package task8;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public class WaitList<E> implements IWaitList<E> {
    Queue<E> queue;
    public WaitList() {
        queue = new ArrayDeque<>();
    }

    public WaitList (Collection<E> c){
        queue = new ArrayDeque<>();
        queue.addAll(c);
    }

    public String toString(){
        String out = "";
        for (E element : queue){
            out += element + " ";
        }
        return out;
    }

    @Override
    public void add(E element){
        queue.add(element);
    }

    @Override
    public E remove(){
        return queue.remove();
    }

    @Override
    public boolean contains(E element) {
        for (E elem : queue){
            if (elem == element){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return false;
    }

    @Override
    public boolean IsEmpty() {
        if (queue.size() == 0)
            return true;
        return false;
    }

    public void PrintEmpty(){
        if (IsEmpty())
            System.out.println("Список пуст");
        else
            System.out.println("Список не пуст");
    }

    public void PrintContains(E element){
        if (contains(element))
            System.out.println("В очереди содержится элемент " + element);
        else
            System.out.println("В очереди не содержится элемент " + element);
    }
}
