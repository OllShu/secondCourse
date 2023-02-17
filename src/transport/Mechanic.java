package transport;
import transport.Utility.*;

import java.util.Objects;

public class Mechanic {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = Utility.checkParameters(name);
        this.company = Utility.checkParameters(company);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик "+name+" из компании "+company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mechanic)) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(getName(), mechanic.getName()) && Objects.equals(getCompany(), mechanic.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCompany());
    }

    public <T extends Transport> void performMaintenance(T t) {
        System.out.println("Механик "+this+" проводит тех.обслуживание авто "+ t.toString());
    }
    public <T extends Transport> void fixTheCar(T t) {
        System.out.println("Механик "+this+" ремонтирует авто "+ t.toString());
    }
}
