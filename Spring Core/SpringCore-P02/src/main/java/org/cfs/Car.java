package org.cfs;

public class Car {
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("setEngine() is called........");
        this.engine = engine;
    }

    public Car(Engine engine) {
        System.out.println(" Car Constructor running.........");
        this.engine = engine;
    }

    public Car(){
        System.out.println("Car default constructor");
    }

    private Engine engine;// if you want to inject engine by name
                          // then bean name is similar to the property (field or setter method) in your class.
    /*
    If you're using autowire="byName" in XML, Spring will look for a bean with an id that matches the
     name of the property (field or setter method) in your class.
     */

public void drive(){
        int start=engine.start();
        if(start>=1)
        {
            System.out.println("Lets Drive.....");
        }
        else
        {
            System.out.println("Engine not started yet");
        }
    }

}
