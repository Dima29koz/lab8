package task8;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        BoundedWaitList lst;
        lst = new BoundedWaitList(5);
        System.out.println("Размер очереди: " + lst.getCapacity());
        lst.PrintEmpty();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        System.out.println(lst);
        lst.PrintEmpty();
        lst.remove(); // dell 1st element
        lst.add(6);
        System.out.println(lst);
        lst.PrintContains(3);
        lst.PrintContains(1);

        System.out.println();
        UnfairWaitList lst2;
        lst2 = new UnfairWaitList();
        lst2.PrintEmpty();
        lst2.add(4);
        lst2.add(8);
        lst2.add(7);
        lst2.add(6);
        lst2.add(8);
        lst2.add(4);
        lst2.add(3);
        lst2.remove(8);
        System.out.println(lst2);
        lst2.PrintEmpty();
        lst2.moveToBack(6);
        System.out.println(lst2);

    }
}
