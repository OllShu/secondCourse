package transport;

public enum CarBodyType {
    sedan("седан"),
    hatchback("хетчбек"),
    coupe("купе"),
    stationWagon("универсал"),
    SUV("внедорожник"),
    crossover("кроссовер"),
    pickup("пикап"),
    van("фургон"),
    minivan("минивен");

    private String translation;
    CarBodyType(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Тип кузова" + translation;
    }
}
