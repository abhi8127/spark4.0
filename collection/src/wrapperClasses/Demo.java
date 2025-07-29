package wrapperClasses;

public class Demo {
    public static void main(String[] args) {
        Integer int1=new Integer(20);
        System.out.println(int1);

        Integer int2=Integer.valueOf(10);
        System.out.println(int2);  // it return wrapper object
         Integer i=Integer.valueOf("123");
        System.out.println(i);
    }
}
