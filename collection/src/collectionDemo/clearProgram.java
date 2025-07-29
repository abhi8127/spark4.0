package collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class clearProgram {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            list.add(i);

        }
        System.out.println(list);
        if(list.isEmpty())
        {
            System.out.println("list is empty");
        }
        else {
            System.out.println("List is not empty...");
        }

        list.clear();

        System.out.println(list);
        if(list.isEmpty())
        {
            System.out.println("list is empty");
        }
        else {
            System.out.println("List is not empty...");
        }
    }
}
