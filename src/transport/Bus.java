package transport;

public class Bus extends Transport {
    private String someParameter;
    public Bus (String brand,
                String model,
                int year,
                String country,
                String color,
                int maxSpeed,
                String someParameter) {
    super(brand, model, year, country, color, maxSpeed);
    this.someParameter = Utility.checkParameters(someParameter);
    }

    public String getSomeParameter() {
        return someParameter;
    }

    public void setSomeParameter(String someParameter) {
        this.someParameter = someParameter;
    }

    @Override
    public String toString() {
        return super.getBrand()+" "+ super.getModel()+" - год выпуска  " + super.getYear() +
                ", цвет "+super.getColor()+ ", страна сборки "+ super.getCountry() +
                ", максимальная скорость "+super.getMaxSpeed()+", "+someParameter;
    }
}
