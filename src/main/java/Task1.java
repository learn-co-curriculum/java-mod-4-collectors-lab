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