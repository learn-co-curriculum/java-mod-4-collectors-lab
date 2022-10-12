
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task3Test {

    List<Vehicle> vehicles;

    @BeforeEach
    void setUp() {
        vehicles = List.of(
                new Vehicle("abc", VehicleType.SUV, 1000),
                new Vehicle("def", VehicleType.CAR, 2000),
                new Vehicle("xyz", VehicleType.CAR, 3000),
                new Vehicle("opq", VehicleType.TRUCK, 4000),
                new Vehicle("jkl", VehicleType.CAR, 5000)
        );
    }

    @Disabled
    @Test
    void countByType() {
        Map<VehicleType, Long> result = Task3.countByType(vehicles);
        assertEquals(result.get(VehicleType.CAR), 3);
        assertEquals(result.get(VehicleType.TRUCK), 1);
        assertEquals(result.get(VehicleType.SUV), 1);
    }
}