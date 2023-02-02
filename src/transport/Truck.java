package transport;

import transport.Utility.*;

public class Truck extends Transport<DriverWithLicenseC> {
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 DriverWithLicenseC driverWithLicenseC) {
        super(brand, model, engineVolume, driverWithLicenseC);
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
}
