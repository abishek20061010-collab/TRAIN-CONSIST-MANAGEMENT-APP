import java.util.LinkedList;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Use Case 4: Maintain Ordered Train Consist using LinkedList
 *
 * @author Developer
 * @version 4.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App v4.0 =====");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // ADD bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // INSERT Pantry Car at position 2
        train.add(2, "Pantry");

        System.out.println("\nAfter inserting Pantry at position 2:");
        System.out.println(train);

        // REMOVE first and last
        train.removeFirst();
        train.removeLast();

        System.out.println("\nAfter removing first and last bogie:");
        System.out.println(train);
    }
}