package transport;
import transport.Car.*;
public class Main {
    public static void main(String[] args) {
        String month="январь";
        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Granta", 2015, "Россия", "желтый",
                179, 1.7, "механика", "хэтчбек", "1А111АА999",
                5, true, new Key(true,false));
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный",
                250, 3.0,"автомат", "седан", "С222СС999",
                5, true, new Key(true, true));
        cars[2] = new Car("BMW", "Z8", 2021, "Германия", "черный", 250,
                3.0,"автомат", "родстер", "О333ОО999", 5,
                true, new Key(true, true));
        cars[3] = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея","красный",
                184, 2.4,"механика", "кроссовер","К444КК999",
                5, false, new Key(true, true));
        cars[4] = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый",
                160,1.6, "автомат", "седан", "Н555Н999",
                5, false, new Key(true, true));
        for (Car car : cars) {
            System.out.println(car);
            Utility.changeTiresForSeasons(month, car.isWinterTires());
        }

        Bus[] buses = new Bus[3];
        buses[0] = new Bus("ПАЗ", "4234", 2001, "Россия", "белый", 95,
                "городской автобус среднего класса");
        buses[1] = new Bus("Neoplan", "Skyliner", 2001, "Бельгия", "белый", 120,
                "туристический автобус");
        buses[2] = new Bus("Volvo","B10M", 2003, "Швеция", "серый", 130,
                "междугородный автобус");
        for (Bus bus : buses) System.out.println(bus);
    }
}


