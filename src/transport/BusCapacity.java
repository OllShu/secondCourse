package transport;

public enum BusCapacity {
    extraSmall(null, 10),
    small(10, 25),
    medium(40, 50),
    large(60, 80),
    extraLarge(100, 120);
    private Integer minCapacity;
    private Integer maxCapacity;

    BusCapacity(Integer minCapacity, Integer maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Вместимость автобуса " + minCapacity + "-" + maxCapacity + " человек";
    }
}
