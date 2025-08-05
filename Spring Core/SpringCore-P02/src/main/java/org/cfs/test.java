package org.cfs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        System.out.println("----------------BeanFactory Started ------------------");
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println("----------------Bean file loaded ------------------");


        System.out.println("Sending request..........");

        Car car=context.getBean(Car.class);
        car.drive();










    }
}
