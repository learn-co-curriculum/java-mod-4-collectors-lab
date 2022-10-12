
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    List<Vehicle> vehicles;

    @BeforeEach
    void setUp() {
        vehicles = List.of(
                new Vehicle("abc", VehicleType.SUV, 1000),
                new Vehicle("def", VehicleType.SUV, 2000),
                new Vehicle("xyz", VehicleType.CAR, 3000),
                new Vehicle("opq", VehicleType.TRUCK, 4000),
                new Vehicle("jkl", VehicleType.CAR, 5000)
        );
    }

    @Disabled
    @Test
    void getAvgMileage() {
        assertEquals(3000.0, Task1.getAvgMileage(vehicles));
    }
}