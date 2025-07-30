package setDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        /*
        Duplicat not alloed here
        inseration order not maintatin
        sort the list in increasing order
         */
        Set<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(120);
        set.add(50);
        set.add(120);
        System.out.println(set);
    }
}
