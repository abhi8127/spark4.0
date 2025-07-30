package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("DSA","C#","java","Devops"));
      ListIterator<String> listIterator =list.listIterator();

        System.out.println("Forward Direction");
      while(listIterator.hasNext())
      {
          String data=listIterator.next();
          System.out.println(data);
          if(data.equals("java"))
          {
              listIterator.set("python");
          }
      }
        System.out.println("----------------------------------");
        System.out.println("BackWard Direction......");

        while(listIterator.hasPrevious())
        {
            String data=listIterator.previous();
            System.out.println(data);


        }
        System.out.println("--------FINALE LIST__________");
        System.out.println(list);
    }
}
