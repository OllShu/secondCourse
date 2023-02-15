package transport;

import transport.Utility.*;
import transport.Driver.*;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private Driver T;
    private List<Mechanic> mechanicList;



    public Transport (String brand,
                      String model,
                      double engineVolume,
                      Driver T,
                      List<Mechanic> mechanicList) {
        this.brand = Utility.checkParameters(brand);
        this.model = Utility.checkParameters(model);
        this.engineVolume = Utility.checkEngineVolume(engineVolume);
        this.T = T;
        this.mechanicList = mechanicList;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Driver getT() {
        return T;
    }

    public void setT(Driver t) {
        T = t;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    public void startMoving() {
        System.out.println("Авто "+brand+" "+model+" начал движение"); }

    public void finishTheMovement() {
        System.out.println("Авто "+brand+" "+model+" закончил движение");
    }

    public void printType(){
       }

    public void passDiagnostics() {
        if (isNotBus()) {
            System.out.println("Транспорт проходит диагностику");
        } else {
            try {
                throw new TransportTypeException("Автобусы не должны проходить диагностику");
            } catch (TransportTypeException e) {
                System.out.println("исключение: Автобусы не должны проходить диагностику");
            }
        }
    }
    public boolean isNotBus() {
        boolean notBus;
        notBus = Transport.this.getClass() != Bus.class;
        return notBus;
    }
    public <T extends Transport<Driver>> void findDriverAndMechanics (T t) {
        System.out.println(brand+" "+model + " - водитель " + t.getT().getFIO() + ", механики: " + getMechanicList());
    }


}
