package org.cfs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        System.out.println("----------------BeanFactory Started ------------------");
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("----------------Bean file loaded ------------------");


        System.out.println("Sending request..........");
/*
        Car car=context.getBean(Car.class);
        car.drive();

 */

        // checking for scope
        System.out.println("--------first object creation-----------");

        Car car1=context.getBean(Car.class);

        System.out.println("--------Second object creation-----------");

        Car car2=context.getBean(Car.class);

        System.out.println("Same car object ? "+(car1==car2));



        System.out.println("--------first object creation for PetrolEngine-----------");

        PetrolEngine p1=context.getBean(PetrolEngine.class);

        System.out.println("--------Second object creation for PetroEngine-----------");

        PetrolEngine p2=context.getBean(PetrolEngine.class);

        System.out.println("Same PetrolEngine object ? "+(p1==p2));




    }
}
