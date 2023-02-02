package transport;

import transport.Utility.*;
import transport.Driver.*;
import transport.DriverWithLicenseB.*;

public class Car extends Transport<DriverWithLicenseB> {

  public Car(String brand,
             String model,
             double engineVolume,
             DriverWithLicenseB driverWithLicenseB) {
    super(brand, model, engineVolume, driverWithLicenseB);
  }

  @Override
  public String toString() {
    return super.getBrand()+" "+super.getModel()+" - объем двигателя "+super.getEngineVolume()+"л";
  }
  @Override
  public void pitStop() {
    System.out.println("Автомобиль "+super.getBrand()+" "+super.getModel()+" на пит-стопе");
  }
  @Override
  public void bestLapTime() {
    System.out.println("Лучшее время автомобиля "+super.getBrand()+" "+super.getModel()+" 7 минут");
  }
  @Override
  public void maximumSpeed() {
    System.out.println("Максимальная скорость автомобиля "+super.getBrand()+" "+super.getModel()+" 160 км/ч");
  }

}