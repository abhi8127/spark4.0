package setDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        //Duplicate not allow in SET
        // Random access is not possible
        // order not preserved
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(120);
        set.add(50);
        set.add(120);
        System.out.println(set);



    }
}
