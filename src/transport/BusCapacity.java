package transport;

public enum BusCapacity {
    extraSmall(null, 10),
    small(10, 25),
    medium(40, 50),
    large(60, 80),
    extraLarge(100, null);
    private Integer minCapacity;
    private Integer maxCapacity;

    BusCapacity(Integer minCapacity, Integer maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        if (minCapacity != null && maxCapacity != null)
            return "Вместимость автобуса " + minCapacity + "-" + maxCapacity + " человек.";
        else if (maxCapacity != null) return "Вместимость автобуса до " + maxCapacity + " человек.";
            else if(minCapacity!=null) return "Вместимость автобуса свыше " + minCapacity + " человек.";
                else return "Ляляля";
    }
}
