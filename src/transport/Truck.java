package transport;

import transport.Utility.*;

public class Truck extends Transport<DriverWithLicenseC> {
    private TruckCapacity truckCapacity;
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverWithLicenseC driverWithLicenseC,
                 TruckCapacity truckCapacity) {
        super(brand, model, engineVolume, driverWithLicenseC);
        this.truckCapacity = truckCapacity;
    }

    public TruckCapacity getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(TruckCapacity truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    @Override
    public String toString() {
        return super.getBrand()+" "+super.getModel()+" - объем двигателя "+super.getEngineVolume()+"л";
    }
    @Override
    public void pitStop() {
        System.out.println("Грузовик "+super.getBrand()+" "+super.getModel()+" на пит-стопе");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время грузовика "+super.getBrand()+" "+super.getModel()+" 16 минут");
    }
    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость грузовика "+super.getBrand()+" "+super.getModel()+" 127 км/ч");
    }
    @Override
    public void printType(){
        if (truckCapacity!=null) System.out.println("Тип транспортного средства "+truckCapacity);
        else System.out.println("Данных по транспортному средству недостаточно");
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Грузовик "+getBrand()+" "+getModel()+" проходит диагностику");
    }
}
