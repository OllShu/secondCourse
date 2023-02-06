package transport;

public enum TruckCapacity {
    N1(0f, 3.5f),
    N2(3.5f, 12.0f ),
    N3(12.0f, 100.0f);

    private float minCapacity;
    private float maxCapacity;

    TruckCapacity(float minCapacity, float maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Грузоподъемность от " + minCapacity + " тонн, до " + maxCapacity + " тонн";
    }
}
