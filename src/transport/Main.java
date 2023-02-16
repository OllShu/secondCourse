package transport;
import transport.Transport.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Mechanic mechanic3 = new Mechanic("Александр Яковлев", "Омега");


        Transport car1 = new Car("Lada", "Granta", 1.6, driverWithLicenseBS[0],
                List.of(mechanic1, mechanic2), CarBodyType.sedan);
        Transport car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, driverWithLicenseBS[1],
                List.of(mechanic1, mechanic3), CarBodyType.sedan);
        Transport car3 = new Car("BMW", "Z8", 3.0, driverWithLicenseBS[2],
                List.of(mechanic2, mechanic3), CarBodyType.sedan);
        Transport car4 = new Car("Kia", "Sportage 4-го поколения", 2.0, driverWithLicenseBS[3],
                List.of(mechanic1, mechanic2, mechanic3), CarBodyType.crossover);
        Transport bus1 = new Bus("ПАЗ", "4234", 4.4, driverWithLicenseDS[0],
                List.of(mechanic1, mechanic3), BusCapacity.extraSmall);
        Transport bus2 = new Bus("Neoplan", "Skyliner", 10.5, driverWithLicenseDS[1],
                List.of(mechanic1, mechanic2), BusCapacity.extraLarge);
        Transport bus3 = new Bus("Volvo", "B10M", 14.9, driverWithLicenseDS[2],
                List.of(mechanic3), BusCapacity.large);
        Transport bus4 = new Bus("Mercedes-Benz", "O405G", 11.9, driverWithLicenseDS[3],
                List.of(mechanic1, mechanic2, mechanic3), BusCapacity.large);
        Transport truck1 = new Truck("КаМАЗ", "5490-S5", 12.0, driverWithLicenseCS[0],
                List.of(mechanic1), TruckCapacity.N1);
        Transport truck2 = new Truck("Scania", "DC16", 15.6, driverWithLicenseCS[1],
                List.of(mechanic2, mechanic3), TruckCapacity.N2);
        Transport truck3 = new Truck("MAN", "TGX", 12.4, driverWithLicenseCS[2],
                List.of(mechanic2), TruckCapacity.N2);
        Transport truck4 = new Truck("Volvo", "D8K", 7.7, driverWithLicenseCS[3],
                List.of(mechanic3), TruckCapacity.N3);

        Transport[] transports = new  Transport[] {car1, car2, car3, car4, bus1, bus2, bus3, bus4, truck1, truck2, truck3, truck4};

    //    Transport transport = transports[0];

        ArrayList<Transport> listRacer = new ArrayList<>();
        for (int i = 0; i < transports.length; i++) {
            listRacer.add(i, transports[i]);
        }

        for (Transport transport : transports) {
    //        System.out.println(transport);
            outputInfo(transport.getT().getFIO(), transport.getBrand(), transport.getModel());
            transport.passDiagnostics();
    //        transport.findDriverAndMechanics(transport);
        }


        Map <Transport, List<Mechanic>> hashMap = new HashMap<>();
        hashMap.put(car1, car1.getMechanicList());
        hashMap.put(car2, car2.getMechanicList());
        hashMap.put(car3, car3.getMechanicList());
        hashMap.put(car4, car4.getMechanicList());
        hashMap.put(bus1, bus1.getMechanicList());
        hashMap.put(bus2, bus2.getMechanicList());
        hashMap.put(bus3, bus3.getMechanicList());
        hashMap.put(bus4, bus4.getMechanicList());
        hashMap.put(truck1, truck1.getMechanicList());
        hashMap.put(truck2, truck2.getMechanicList());
        hashMap.put(truck3, truck3.getMechanicList());
        hashMap.put(truck4, truck4.getMechanicList());

        System.out.println(hashMap);
    }

    public static void outputInfo(String name, String brand, String model) {
        System.out.println("Водитель " + name + " управляет автомобилем " + brand +" "+model+" и будет участвовать в заезде");
    }
}




