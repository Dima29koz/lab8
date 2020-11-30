package task8;

import java.util.ArrayDeque;

public class UnfairWaitList<E> extends WaitList{

    public UnfairWaitList() {}

    public void remove(E element){
        if (queue.peek() != element)
            queue.remove(element);
    }

    public void moveToBack(E element){
        if (queue.remove(element))
            queue.add(element);
    }
}
