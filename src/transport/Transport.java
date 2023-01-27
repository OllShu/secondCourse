package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport (String brand,
                      String model,
                      int year,
                      String country,
                      String color,
                      int maxSpeed) {
        this.brand = Utility.checkParameters(brand);
        this.model = Utility.checkParameters(model);
        this.year = Utility.checkYear(year);
        this.country = Utility.checkParameters(country);
        this.color = Utility.checkParameters(color);
        this.maxSpeed = Utility.checkMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        Utility.checkParameters(color);
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        Utility.checkMaxSpeed(maxSpeed);
        this.maxSpeed = maxSpeed;
    }
}
