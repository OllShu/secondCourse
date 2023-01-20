public class Car {
  private final String brand;
  private final String model;
  private double engineVolume;
  private String color;
  private final int year;
  private final String country;

  public Car(String brand, String model, double engineVolume, String color, int year, String country) {
    this.brand = checkParameters(brand);
    this.model = checkParameters(model);
    this.engineVolume = checkEngineVolume(engineVolume);
    this.color = checkParameters(color);
    this.year = checkYear(year);
    this.country = checkParameters(country);
    }

  private static String checkParameters (String parameter) {
    
    if (parameter == null || parameter.isEmpty()) {
      parameter = "default";
    }
      return parameter;
  }
  private static int checkYear (int parameter) {
    if (parameter <= 0)
      parameter = 2000;
    return parameter;
  }

private static double checkEngineVolume(double parameter) {
    if (parameter <= 0)
      parameter = 1.5;
    return parameter;
}
   @Override
  public String toString() {
    return brand+" "+ model+" год выпуска  " + year + ", цвет "+color+ ", объем двигателя "+ engineVolume +
            ", страна сборки "+ country;
  }
}