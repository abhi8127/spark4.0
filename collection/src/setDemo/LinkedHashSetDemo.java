package setDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Duplicate not allow
        // Random access not possible
        /* But order preserve here bcoz we know that the in the node of
        linkedlist it store value and address of next varible and if it
         is doubly linked list so it store the address of previous and
               next both;*/
        Set<Integer> set=new LinkedHashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(120);
        set.add(50);
        set.add(120);
        System.out.println(set);
    }
}
