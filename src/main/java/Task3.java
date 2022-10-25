import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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