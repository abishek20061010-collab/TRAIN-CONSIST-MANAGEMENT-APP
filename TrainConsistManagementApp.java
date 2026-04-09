import java.util.LinkedHashSet;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
 *
 * Description:
 * Demonstrates how LinkedHashSet maintains insertion order
 * while preventing duplicate bogies in train formation.
 *
 * @author Abishek
 * @version 5.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App v5.0 =====");

        // LinkedHashSet to maintain order + uniqueness
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Adding duplicate (will be ignored)
        trainFormation.add("Sleeper");

        // Display final formation
        System.out.println("Train Formation (No duplicates, Ordered):");
        System.out.println(trainFormation);
    }
}