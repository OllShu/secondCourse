package transport;

import transport.Utility.*;

public class Bus extends Transport<DriverWithLicenseD> {
    private BusCapacity busCapacity;
    public Bus(String brand,
               String model,
               double engineVolume,
               DriverWithLicenseD driverWithLicenseD,
               BusCapacity busCapacity) {
        super(brand, model, engineVolume, driverWithLicenseD);
        this.busCapacity = busCapacity;
    }

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public String toString() {
        return super.getBrand()+" "+super.getModel()+" - объем двигателя "+super.getEngineVolume()+"л";
    }
    @Override
    public void pitStop() {
        System.out.println("Автобус "+super.getBrand()+" "+super.getModel()+" на пит-стопе");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время автобуса "+super.getBrand()+" "+super.getModel()+" 25 минут");
    }
    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость автобуса "+super.getBrand()+" "+super.getModel()+" 109 км/ч");
    }
    @Override
    public void printType(){
        if (busCapacity!=null) System.out.println("Тип транспортного средства "+busCapacity);
        else System.out.println("Данных по транспортному средству недостаточно");
    }
}
