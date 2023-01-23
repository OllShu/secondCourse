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
  private Key key;

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
             boolean winterTires,
             Key key) {
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
    setKey(key);
  }
  public String getBrand() {
    return brand;
  }

  public double getEngineVolume() {
    return engineVolume;
  }

  public void setEngineVolume(double engineVolume) {
    Utility.checkEngineVolume(engineVolume);
    this.engineVolume = engineVolume;
  }

  public String getModel() {
    return model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    Utility.checkParameters(color);
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
    Utility.checkParameters(transmission);
    this.transmission = transmission;
  }

  public String getBodyType() {
    return bodyType;
  }

  public String getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber) {
    Utility.checkRegistrationNumber(registrationNumber);
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

  public Key getKey() {
    return key;
  }

  public void setKey(Key key) {
    if (key==null) {
      key = new Key(false,false);
    }
    this.key = key;
  }

  @Override
  public String toString() {
   String tires;
    if (winterTires==true) tires = "зимняя";
    else tires = "летняя";
    return brand+" "+ model+" год выпуска  " + year + ", цвет "+color+ ", объем двигателя "+ engineVolume +
            ", страна сборки "+ country+ ", коробка передач - "+transmission +", тип кузова - "+ bodyType +
            ", регистрационный номер - " + registrationNumber + ", количество мест - "+ numberOfSeats +
            ", " +tires + " резина" +", "+ key;

  }
  public static class Key {
    private final boolean remoteEngineStart;
    private final boolean keylessAccess;

    public Key (boolean remoteEngineStart, boolean keylessAccess){
      this.remoteEngineStart = remoteEngineStart;
      this.keylessAccess = keylessAccess;
    }

    public boolean isRemoteEngineStart() {
      return remoteEngineStart;
    }

    public boolean isKeylessAccess() {
      return keylessAccess;
    }

    @Override
    public String toString() {
      return (remoteEngineStart? "удаленный запуск двигателя":"без удаленного запуска двигателя")+", "+
              (keylessAccess? "бесключевой доступ":"бесключевого доступа нет");
    }
  }

}