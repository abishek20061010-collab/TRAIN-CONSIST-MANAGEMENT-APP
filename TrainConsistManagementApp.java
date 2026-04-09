import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * @author Developer
 * @version 2.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App v2.0 =====");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After adding bogies:");
        System.out.println(passengerBogies);

        // REMOVE bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // CHECK existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        // FINAL STATE
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}