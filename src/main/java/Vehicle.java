public class Vehicle {
    private String vin;
    private VehicleType type;
    private int mileage;

    public Vehicle(String vin, VehicleType type, int mileage) {
        this.vin = vin;
        this.type = type;
        this.mileage = mileage;
    }

    public String getVin() {
        return vin;
    }

    public VehicleType getType() {
        return type;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin='" + vin + '\'' +
                ", type=" + type +
                ", mileage=" + mileage +
                '}';
    }
}


