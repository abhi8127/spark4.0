package org.cfs;

public class Car {
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(Engine engine) {
        System.out.println(" Car Constructor running.........");
        this.engine = engine;
    }

    private Engine engine;

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
