package transport;
import transport.Transport.*;

public class Main {
    public static void main(String[] args) {

        DriverWithLicenseB[] driverWithLicenseBS = new DriverWithLicenseB[4];
        driverWithLicenseBS[0] = new DriverWithLicenseB("Ковалев АА", true, 6, true);
        driverWithLicenseBS[1] = new DriverWithLicenseB("Киселев ББ", true, 7, true);
        driverWithLicenseBS[2] = new DriverWithLicenseB("Кучков ВВ", true, 8, true);
        driverWithLicenseBS[3] = new DriverWithLicenseB("Кузнецов РР", true, 9, true);

        Car[] cars = new Car[4];
        cars[0] = new Car("Lada", "Granta", 1.6, driverWithLicenseBS[0], CarBodyType.sedan);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, driverWithLicenseBS[1], CarBodyType.sedan);
        cars[2] = new Car("BMW", "Z8", 3.0, driverWithLicenseBS[2], CarBodyType.sedan);
        cars[3] = new Car("Kia", "Sportage 4-го поколения", 2.0, driverWithLicenseBS[3], CarBodyType.crossover);

        for (Car car : cars) {
            System.out.println(cars);
            outputInfo(car.getT().getFIO(), car.getBrand());
            car.passDiagnostics();
        }

        DriverWithLicenseD[] driverWithLicenseDS = new DriverWithLicenseD[4];
        driverWithLicenseDS[0] = new DriverWithLicenseD("Веселов АА", true, 15, true);
        driverWithLicenseDS[1] = new DriverWithLicenseD("Войков ББ", true, 16, true);
        driverWithLicenseDS[2] = new DriverWithLicenseD("Викентьев КК", true, 17, true);
        driverWithLicenseDS[3] = new DriverWithLicenseD("Воробьев СС", true, 18, true);

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("ПАЗ", "4234", 4.4, driverWithLicenseDS[0], BusCapacity.extraSmall);
        buses[1] = new Bus("Neoplan", "Skyliner", 10.5, driverWithLicenseDS[1], BusCapacity.extraLarge);
        buses[2] = new Bus("Volvo", "B10M", 14.9, driverWithLicenseDS[2], BusCapacity.large);
        buses[3] = new Bus("Mercedes-Benz", "O405G", 11.9, driverWithLicenseDS[3], BusCapacity.large);

        for (Bus bus : buses) {
            System.out.println(bus);
            outputInfo(bus.getT().getFIO(), bus.getBrand());
            bus.passDiagnostics();
        }

        DriverWithLicenseC[] driverWithLicenseCS = new DriverWithLicenseC[4];
        driverWithLicenseCS[0] = new DriverWithLicenseC("Сидоров НН", true, 10, true);
        driverWithLicenseCS[1] = new DriverWithLicenseC("Соколов ММ", true, 11, true);
        driverWithLicenseCS[2] = new DriverWithLicenseC("Соседов ПП", true, 12, true);
        driverWithLicenseCS[3] = new DriverWithLicenseC("Сачков СС", true, 13, true);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("КаМАЗ", "5490-S5", 12.0, driverWithLicenseCS[0], TruckCapacity.N1);
        trucks[1] = new Truck("Scania", "DC16", 15.6, driverWithLicenseCS[1], TruckCapacity.N2);
        trucks[2] = new Truck("MAN", "TGX", 12.4, driverWithLicenseCS[2], TruckCapacity.N2);
        trucks[3] = new Truck("Volvo", "D8K", 7.7, driverWithLicenseCS[3], TruckCapacity.N3);

        for (Truck truck : trucks) {
            System.out.println(truck);
            outputInfo(truck.getT().getFIO(), truck.getBrand());
            truck.passDiagnostics();
        }
    }

    public static void outputInfo(String name, String brand) {
        System.out.println("Водитель " + name + " управляет автомобилем " + brand + " и будет участвовать в заезде");
    }
}




