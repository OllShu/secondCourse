package transport;

import transport.Utility.*;
import transport.Driver.*;
import transport.DriverWithLicenseB.*;
import transport.CarBodyType.*;
public class Car extends Transport<DriverWithLicenseB> {
  private CarBodyType carBodyType;

  public Car(String brand,
             String model,
             double engineVolume,
             Driver T,
             CarBodyType carBodyType) {
    super(brand, model, engineVolume, T);
    this.carBodyType = carBodyType;
  }

  public CarBodyType getCarBodyType() {
    return carBodyType;
  }

  public void setCarBodyType(CarBodyType carBodyType) {
    this.carBodyType = carBodyType;
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
  @Override
  public void printType(){
    if (carBodyType!=null) System.out.println("Тип транспортного средства "+carBodyType);
      else System.out.println("Данных по транспортному средству недостаточно");
  }

  @Override
  public void passDiagnostics() {
    System.out.println("Автомобиль "+getBrand()+" "+getModel()+" проходит диагностику");
  }
}