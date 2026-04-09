import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistApp
 * ============================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 *
 * @author Developer
 * @version 1.0
 */

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App v1.0 =====");

        // Create empty train consist (dynamic list)
        List<String> trainConsist = new ArrayList<>();

        // Display initial state
        System.out.println("Train initialized successfully.");
        System.out.println("Total number of bogies: " + trainConsist.size());

        // Print train consist
        System.out.println("Current Train Consist: " + trainConsist);
    }
}