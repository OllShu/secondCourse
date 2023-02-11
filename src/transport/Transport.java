package transport;

import transport.Utility.*;
import transport.Driver.*;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private Driver T;

    public Transport (String brand,
                      String model,
                      double engineVolume,
                      Driver T) {
        this.brand = Utility.checkParameters(brand);
        this.model = Utility.checkParameters(model);
        this.engineVolume = Utility.checkEngineVolume(engineVolume);
        this.T = T;
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

    public void startMoving() {
        System.out.println("Авто "+brand+" "+model+" начал движение"); }

    public void finishTheMovement() {
        System.out.println("Авто "+brand+" "+model+" закончил движение");
    }

    public void printType(){
       }

    public void passDiagnostics() {
        if (findNotBus()) {
            System.out.println("Транспорт проходит диагностику");
        } else {
            try {
                throw new TransportTypeException("Автобусы не должны проходить диагностику");
            } catch (TransportTypeException e) {
                System.out.println("исключение: Автобусы не должны проходить диагностику");
            }
        }
    }
    public boolean findNotBus() {
        boolean notBus;
        notBus = Transport.this.getClass() != Bus.class;
        return notBus;
    }
}
