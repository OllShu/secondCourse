package transport;
import transport.Utility.*;
public class Car {
  private final String brand;
  private final String model;
  private double engineVolume;
  private String color;
  private final int year;
  private final String country;
  private String transmission;
  private final String bodyType;
  private String registrationNumber;
  private final int numberOfSeats;
  private boolean winterTires;

  public Car(String brand,
             String model,
             double engineVolume,
             String color,
             int year,
             String country,
             String transmission,
             String bodyType,
             String registrationNumber,
             int numberOfSeats,
             boolean winterTires) {
    this.brand = Utility.checkParameters(brand);
    this.model = Utility.checkParameters(model);
    this.engineVolume = Utility.checkEngineVolume(engineVolume);
    this.color = Utility.checkParameters(color);
    this.year = Utility.checkYear(year);
    this.country = Utility.checkParameters(country);
    this.transmission = Utility.checkParameters(transmission);
    this.bodyType = Utility.checkParameters(bodyType);
    this.registrationNumber = Utility.checkParameters(registrationNumber);
    this.numberOfSeats = Utility.checkNumberOfSeats(numberOfSeats);
    this.winterTires = winterTires;
    }

  public String getBrand() {
    return brand;
  }

  public double getEngineVolume() {
    return engineVolume;
  }

  public void setEngineVolume(double engineVolume) {
    this.engineVolume = engineVolume;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public String getCountry() {
    return country;
  }

  public String getTransmission() {
    return transmission;
  }

  public void setTransmission(String transmission) {
    this.transmission = transmission;
  }

  public String getBodyType() {
    return bodyType;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public boolean isWinterTires() {
    return winterTires;
  }

  public void setWinterTires(boolean winterTires) {
    this.winterTires = winterTires;
  }

  @Override
  public String toString() {
   String tires;
    if (winterTires==true) tires = "зимняя";
    else tires = "летняя";
    return brand+" "+ model+" год выпуска  " + year + ", цвет "+color+ ", объем двигателя "+ engineVolume +
            ", страна сборки "+ country+ ", коробка передач - "+transmission +", тип кузова - "+ bodyType +
            ", регистрационный номер - " + registrationNumber + ", количество мест - "+ numberOfSeats +
            ", " +tires + " резина";
  }
}