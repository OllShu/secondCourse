package transport;
import transport.Transport.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DriverWithLicenseB[] driverWithLicenseBS = new DriverWithLicenseB[4];
        driverWithLicenseBS[0] = new DriverWithLicenseB("Ковалев АА", true, 6, true);
        driverWithLicenseBS[1] = new DriverWithLicenseB("Киселев ББ", true, 7, true);
        driverWithLicenseBS[2] = new DriverWithLicenseB("Кучков ВВ", true, 8, true);
        driverWithLicenseBS[3] = new DriverWithLicenseB("Кузнецов РР", true, 9, true);

        DriverWithLicenseD[] driverWithLicenseDS = new DriverWithLicenseD[4];
        driverWithLicenseDS[0] = new DriverWithLicenseD("Веселов АА", true, 15, true);
        driverWithLicenseDS[1] = new DriverWithLicenseD("Войков ББ", true, 16, true);
        driverWithLicenseDS[2] = new DriverWithLicenseD("Викентьев КК", true, 17, true);
        driverWithLicenseDS[3] = new DriverWithLicenseD("Воробьев СС", true, 18, true);

        DriverWithLicenseC[] driverWithLicenseCS = new DriverWithLicenseC[4];
        driverWithLicenseCS[0] = new DriverWithLicenseC("Сидоров НН", true, 10, true);
        driverWithLicenseCS[1] = new DriverWithLicenseC("Соколов ММ", true, 11, true);
        driverWithLicenseCS[2] = new DriverWithLicenseC("Соседов ПП", true, 12, true);
        driverWithLicenseCS[3] = new DriverWithLicenseC("Сачков СС", true, 13, true);

        Mechanic mechanic1 = new Mechanic("Дмитрий Волков", "Альфа");
        Mechanic mechanic2 = new Mechanic("Степан Мосин", "Зет");
        Mechanic mechanic3 = new Mechanic("Александр Яковлев", "Лучшая");



        Transport[] transports = new Transport[12];
        transports[0] = new Car("Lada", "Granta", 1.6, driverWithLicenseBS[0],
                List.of(mechanic1, mechanic2), CarBodyType.sedan);
        transports[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, driverWithLicenseBS[1],
                List.of(mechanic1, mechanic3), CarBodyType.sedan);
        transports[2] = new Car("BMW", "Z8", 3.0, driverWithLicenseBS[2],
                List.of(mechanic2, mechanic3), CarBodyType.sedan);
        transports[3] = new Car("Kia", "Sportage 4-го поколения", 2.0, driverWithLicenseBS[3],
                List.of(mechanic1, mechanic2, mechanic3), CarBodyType.crossover);

     /*   for (Car car : cars) {
            System.out.println(cars);
            outputInfo(car.getT().getFIO(), car.getBrand());
            car.passDiagnostics();
        }

      */

       // Bus[] buses = new Bus[4];

        transports[4] = new Bus("ПАЗ", "4234", 4.4, driverWithLicenseDS[0],
                List.of(mechanic1, mechanic3), BusCapacity.extraSmall);
        transports[5] = new Bus("Neoplan", "Skyliner", 10.5, driverWithLicenseDS[1],
                List.of(mechanic1, mechanic2), BusCapacity.extraLarge);
        transports[6] = new Bus("Volvo", "B10M", 14.9, driverWithLicenseDS[2],
                List.of(mechanic3), BusCapacity.large);
        transports[7] = new Bus("Mercedes-Benz", "O405G", 11.9, driverWithLicenseDS[3],
                List.of(mechanic1, mechanic2, mechanic3), BusCapacity.large);

       /* for (Bus bus : buses) {
            System.out.println(bus);
            outputInfo(bus.getT().getFIO(), bus.getBrand());
            bus.passDiagnostics();
        }

        */

        //Truck[] trucks = new Truck[4];
        transports[8] = new Truck("КаМАЗ", "5490-S5", 12.0, driverWithLicenseCS[0],
                List.of(mechanic1), TruckCapacity.N1);
        transports[9] = new Truck("Scania", "DC16", 15.6, driverWithLicenseCS[1],
                List.of(mechanic2, mechanic3), TruckCapacity.N2);
        transports[10] = new Truck("MAN", "TGX", 12.4, driverWithLicenseCS[2],
                List.of(mechanic2), TruckCapacity.N2);
        transports[11] = new Truck("Volvo", "D8K", 7.7, driverWithLicenseCS[3],
                List.of(mechanic3), TruckCapacity.N3);

        ArrayList<Transport> listRacer = new ArrayList<>();
        for (int i = 0; i < transports.length; i++) {
            listRacer.add(i, transports[i]);
        }

        for (Transport transport : transports) {
            System.out.println(transport);
            outputInfo(transport.getT().getFIO(), transport.getBrand(), transport.getModel());
            transport.passDiagnostics();
    //        mechanic1.fixTheCar(transport);
    //        mechanic1.performMaintenance(transport);
            transport.findDriverAndMechanics(transport);

        //    ServiceStation.addToQueue
        //    ServiceStation.makeTechnicalInspection
        }
    }

    public static void outputInfo(String name, String brand, String model) {
        System.out.println("Водитель " + name + " управляет автомобилем " + brand +" "+model+" и будет участвовать в заезде");
    }
}




