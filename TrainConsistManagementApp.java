import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ============================================================
 *
 * UC7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * Demonstrates sorting of bogie objects using Comparator
 * based on seating capacity.
 *
 * @author Abishek
 * @version 7.0
 */

class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString method for printing
    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App v7.0 =====");

        // Create List of Bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Add bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 40));

        // Sort using Comparator (Ascending by capacity)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Bogies sorted by capacity (Ascending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Sort in Descending order (important concept)
        bogieList.sort((b1, b2) -> b2.capacity - b1.capacity);

        System.out.println("\nBogies sorted by capacity (Descending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
    }
}