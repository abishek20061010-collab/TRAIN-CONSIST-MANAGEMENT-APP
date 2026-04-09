import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * UC6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * Demonstrates mapping between bogie name and its capacity
 * using HashMap (key-value structure).
 *
 * @author Abishek
 * @version 6.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App v6.0 =====");

        // Create HashMap for bogie → capacity
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Adding entries (Bogie → Capacity)
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // Display data using entrySet()
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                               " | Capacity: " + entry.getValue());
        }
    }
}