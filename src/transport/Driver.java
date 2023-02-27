package transport;
import transport.Utility.*;

import java.util.Objects;

public class Driver {
    private String FIO;
    private boolean driverLicense;
    private int experience;

    public Driver(String FIO,
                  boolean driverLicense,
                  int experience) {
        this.FIO = Utility.checkParameters(FIO);
        this.driverLicense = driverLicense;
        this.experience = Utility.checkexperience(experience);
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return FIO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experience == driver.experience && Objects.equals(FIO, driver.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, driverLicense, experience);
    }

    public void startMovingDriver() {
        System.out.println("Водитель "+FIO+" начал движение");
    }
    public void stop() {
        System.out.println("Водитель "+FIO+" остановился");
    }
    public void refuelTheFuel() {
        System.out.println("Водитель "+FIO+" заправляет транспортное средство");
    }
}
