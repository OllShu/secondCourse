package transport;
import transport.Car.*;
public class Main {
    public static void main(String[] args) {
        String month="январь";
        Car[] cars = new Car[5];
        cars[0] = new Car("Lada", "Granta", 1.7, "желтый", 2015,
                "Россия", "механика", "хэтчбек", "1А111АА999",
                5, true, new Key(true,false));
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                "Германия", "автомат", "седан", "С222СС999",
                5, true, new Key(true, true));
        cars[2] = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия",
                "автомат", "родстер", "О333ОО999", 5,
                true, new Key(true, true));
        cars[3] = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
                2018, "Южная Корея", "механика", "кроссовер",
                "К444КК999", 5, false, new Key(true, true));
        cars[4] = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", "автомат", "седан", "Н555Н999",
                5, false, new Key(true, true));
        for (Car car : cars) {
            System.out.println(car);
            Utility.changeTiresForSeasons(month, car.isWinterTires());
        }
    }
}


