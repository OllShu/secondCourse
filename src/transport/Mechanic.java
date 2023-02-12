package transport;
import transport.Utility.*;

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

    public <T extends Transport> void performMaintenance(T t) {
        System.out.println("Автобусы не проходят тех.обслуживание");
    }
    public <T extends Transport> void fixTheCar(T t) {
        System.out.println("Механик "+this+" ремонтирует машину "+ toString().toString());
    }
}
