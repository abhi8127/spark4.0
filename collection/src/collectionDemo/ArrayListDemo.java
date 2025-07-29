package collectionDemo;

import java.util.ArrayList;

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
    }
}
