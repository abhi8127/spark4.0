package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // insertion order maintain
        // duplicate allow
        // random access possible
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(20);
        arr1.add(30);
        System.out.println(arr1);

        System.out.println(arr1.get(3));
        System.out.println(arr1.size());
        arr1.add(2,900);
        System.out.println(arr1);
        if(arr1.isEmpty())
        {
            System.out.println("List is empty''''''");
        }
        else
        {
            System.out.println("Not Empty.....");
        }

        /*
        This iterator is used for traverse over any collection
        and here also we delete element from collection using this iterator unlike Enumarator
         */
        Iterator<Integer> it =arr1.iterator();

        System.out.println("now we are using iterator to traverse over the list");

        while(it.hasNext())
        {
            int data=it.next();
            if(data==20)
            {
                it.remove();
                System.out.println("Removed :"+data);
            }
            else
            {
                System.out.println(data);
            }
        }
    }
}
