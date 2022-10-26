# Stream Lab 3 

## Instruction


### Task #1

We will work with the `Vehicle` class:

```java
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

public enum VehicleType {
    TRUCK, CAR, SUV, VAN
}
```


Edit Task1.java to implement the  `getAvgMileage` method that takes in a `List<Vehicle>`
and returns the average mileage of the vehicles in the list.   

Your implementation should call the `collect` terminal stream method, passing
an appropriate `Collector` for computing the average, and
should not call intermediate stream methods such as `map`.

```java
import java.util.*;
import java.util.stream.Collectors;

class Task1 {

    //modify this method
    public static double getAvgMileage(List<Vehicle> vehicles) {
       return 0.0;
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Vehicle("4Y1SL65848Z411439", VehicleType.CAR, 87000),
                new Vehicle("8YABC94G32H44L321", VehicleType.SUV, 23450),
                new Vehicle("2A942JEIJ9911HG33", VehicleType.CAR, 5000),
                new Vehicle("93HE562347JKIU339", VehicleType.TRUCK, 0),
                new Vehicle("45GNCEWK74235LI11", VehicleType.SUV, 120000)
                );

        System.out.println(getAvgMileage(vehicles));  //47090.0
    }
}
```

The program should print:

```text
47090.0
```

#### Test your implementation

Edit the Junit test class `Task1Test` to remove the `@Disabled`
annotation from the `getAvgMileage()` test method.  

Run `Task1Test` to confirm your implementation:

```java
@Disabled
@Test
void getAvgMileage() {
        ....
}
```


### Task #2

Edit Task2.java to implement the  `avgCarMileage` method that takes in a `List<Vehicle>`
and returns the average mileage of the vehicles with type VehicleType.CAR.

Your implementation should create a pipeline that filters the stream to
select cars before collecting the average mileage.

```java
class Task2 {

    //modify this method
    public static double avgCarMileage(List<Vehicle> vehicles) {
        return 0.0;
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Vehicle("4Y1SL65848Z411439", VehicleType.CAR, 87000),
                new Vehicle("8YABC94G32H44L321", VehicleType.SUV, 23450),
                new Vehicle("2A942JEIJ9911HG33", VehicleType.CAR, 5000),
                new Vehicle("93HE562347JKIU339", VehicleType.TRUCK, 0),
                new Vehicle("45GNCEWK74235LI11", VehicleType.SUV, 120000)
        );

        //(87000+5000)/2 = 46000.0
        System.out.println(avgCarMileage(vehicles));  //46000.0
    }
}
```

The program should print:

```text
46000.0
```

#### Test your implementation

Edit the Junit test class `Task2Test` to remove the `@Disabled`
annotation from the `avgCarMileage()` test method.

Run `Task2Test` to confirm your implementation.

### Task #3

Edit Task3.java to implement the  `countByType` method that takes in a `List<Vehicle>`
and returns a `Map` with the key `VehicleType` mapped to the corresponding count.

Your implementation should use grouping with a downstream collector to produce a count
per vehicle type.

```java
class Task3 {

    //modify this method
    public static Map<VehicleType, Long>  countByType(List<Vehicle> vehicles) {
        return null;
    }

    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new Vehicle("4Y1SL65848Z411439", VehicleType.CAR, 87000),
                new Vehicle("8YABC94G32H44L321", VehicleType.SUV, 23450),
                new Vehicle("2A942JEIJ9911HG33", VehicleType.CAR, 5000),
                new Vehicle("93HE562347JKIU339", VehicleType.TRUCK, 0),
                new Vehicle("45GNCEWK74235LI11", VehicleType.SUV, 120000)
                );

        Map<VehicleType, Long> result = countByType(vehicles);
        
        System.out.println(result.get(VehicleType.CAR));  //2
        System.out.println(result.get(VehicleType.TRUCK)); //1
        System.out.println(result.get(VehicleType.SUV)); //2
    }
}
```

The program should print:

```text
2
1
2
```

#### Test your implementation

Edit the Junit test class `Task3Test` to remove the `@Disabled`
annotation from the `countByType()` test method.

Run `Task3Test` to confirm your implementation.
