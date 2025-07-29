package vectorDemo;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        // it is Similar as ArrayList but it is thread safe
        Vector<Integer> vector=new Vector<>();
        vector.add(10);
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println(vector);
        if(vector.isEmpty())
        {
            System.out.println("Empty......");
        }
        else {
            System.out.println("Not empty");
        }
    }
}
