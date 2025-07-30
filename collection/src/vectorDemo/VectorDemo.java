package vectorDemo;

import java.util.Enumeration;
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

        /*
        Enumeration is a legacy interface used for iterating over older collections
        like Vector and Hashtable.
        It was introduced before Iterator and is part of the java.util package.

        and the drawback of this is it only fetch element not remove element from colletion

         */
        Enumeration e= vector.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
