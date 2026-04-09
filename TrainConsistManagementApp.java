import java.util.HashSet;
import java.util.Set;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * Use Case 3: Track Unique Bogie IDs using HashSet
 *
 * @author Developer
 * @version 3.0
 */

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App v3.0 =====");

        // Create HashSet for bogie IDs (unique values only)
        Set<String> bogieIds = new HashSet<>();

        // ADD bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Bogie IDs after insertion (duplicates ignored):");
        System.out.println(bogieIds);

        // Display total unique bogies
        System.out.println("\nTotal unique bogies: " + bogieIds.size());
    }
}