package transport;
import transport.Transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        DriverWithLicenseB driverB1 = new DriverWithLicenseB("Ковалев АА", true, 6, true);
        DriverWithLicenseB driverB2 = new DriverWithLicenseB("Киселев ББ", true, 7, true);
        DriverWithLicenseB driverB3 = new DriverWithLicenseB("Кучков ВВ", true, 8, true);
        DriverWithLicenseB driverB4 = new DriverWithLicenseB("Кузнецов РР", true, 9, true);

        DriverWithLicenseB[] driverWithLicenseBS = new DriverWithLicenseB[] {driverB1, driverB2, driverB3, driverB4};

        DriverWithLicenseD driverD1 = new DriverWithLicenseD("Веселов АА", true, 15, true);
        DriverWithLicenseD driverD2 = new DriverWithLicenseD("Войков ББ", true, 16, true);
        DriverWithLicenseD driverD3 = new DriverWithLicenseD("Викентьев КК", true, 17, true);
        DriverWithLicenseD driverD4 = new DriverWithLicenseD("Воробьев СС", true, 18, true);

        DriverWithLicenseD[] driverWithLicenseDS = new DriverWithLicenseD[] {driverD1, driverD2, driverD3, driverD4};

        DriverWithLicenseC driverC1 = new DriverWithLicenseC("Сидоров НН", true, 10, true);
        DriverWithLicenseC driverC2 = new DriverWithLicenseC("Соколов ММ", true, 11, true);
        DriverWithLicenseC driverC3 = new DriverWithLicenseC("Соседов ПП", true, 12, true);
        DriverWithLicenseC driverC4 = new DriverWithLicenseC("Сачков СС", true, 13, true);

        DriverWithLicenseC[] driverWithLicenseCS = new DriverWithLicenseC[] {driverC1, driverC2, driverC3, driverC4};

        Set <Driver> hashSet = new HashSet<>();
        hashSet.add(driverB1);
        hashSet.add(driverB2);
        hashSet.add(driverB3);
        hashSet.add(driverB4);
        hashSet.add(driverD1);
        hashSet.add(driverD2);
        hashSet.add(driverD3);
        hashSet.add(driverD4);
        hashSet.add(driverC1);
        hashSet.add(driverC2);
        hashSet.add(driverC3);
        hashSet.add(driverC4);

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

    //    System.out.println(hashMap);
        for (Map.Entry<Transport, List<Mechanic>> entry: hashMap.entrySet()) {
            System.out.println("Авто "+entry.getKey()+" обслуживают механики - "+entry.getValue());
        }

    //    System.out.println(hashSet);
        Iterator<Driver> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println(driver);
        }

    }

    public static void outputInfo(String name, String brand, String model) {
        System.out.println("Водитель " + name + " управляет автомобилем " + brand +" "+model+" и будет участвовать в заезде");
    }
}




