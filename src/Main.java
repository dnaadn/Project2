import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Route route1 = new Route("SA233", "SA333", 10.5);
        Route route2 = new Route("SA244", "SA444", 30);

        Car car1 = new Car("234", 0, route1);
        Car car2 = new Car("235", 4, route2);


        Passenger[] passengers = new Passenger[2];

        passengers[0] = new Subscribers("Dana", "445");
        passengers[1] = new NonSubscribers("Noura", "334", true);

        try {
            passengers[0].reserveCar(car1);
            passengers[0].displayInfo();
        } catch (Exception e) {
            System.out.println("Reservation failed, " + e.getMessage());
        }

        try {
            passengers[1].reserveCar(car2);
            passengers[1].displayInfo();
        } catch (Exception e) {
            System.out.println("Reservation failed, " + e.getMessage());
        }
    }
}











