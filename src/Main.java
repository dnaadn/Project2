import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Route route1 = new Route("SA233", "SA333", 10.5);
        Route route2 = new Route("SA244", "SA444", 30);

        Car car1 = new Car("234", 0, route1);
        Car car2 = new Car("235", 2, route2);

//fix the capacity; after the user reserves a car the number of capacity -- .
        Passenger[] passengers = new Passenger[4];

        passengers[0] = new Subscribers("Dana", "445");
        passengers[1] = new NonSubscribers("Noura", "334", true);
        passengers[2] = new NonSubscribers("Reem", "344", false);
        passengers[3] = new Subscribers("Lana", "455");


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

        try {
            passengers[2].reserveCar(car2);
            passengers[2].displayInfo();
        } catch (Exception e) {
            System.out.println("Reservation failed, " + e.getMessage());
        }
        try {
            passengers[3].reserveCar(car2);
            passengers[3].displayInfo();
        } catch (Exception e) {
            System.out.println("Reservation failed, " + e.getMessage());
        }
    }
}











