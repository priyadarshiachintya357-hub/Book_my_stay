import java.util.HashMap;
import java.util.Map;

/**
 * UseCase3InventorySetup
 *
 * Demonstrates centralized room inventory management
 * using a HashMap in the Book My Stay Hotel Booking System.
 *
 * @author Priyadarshi
 * @version 3.1
 */


/* ---------------- ROOM INVENTORY CLASS ---------------- */

class RoomInventory {

    // HashMap to store room type and availability
    private HashMap<String, Integer> inventory;

    /**
     * Constructor initializes the inventory with room types
     */
    public RoomInventory() {

        inventory = new HashMap<>();

        // Initialize room availability
        inventory.put("Single Room", 10);
        inventory.put("Double Room", 6);
        inventory.put("Suite Room", 3);
    }

    /**
     * Method to get availability of a specific room type
     */
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    /**
     * Method to update availability
     */
    public void updateAvailability(String roomType, int newCount) {
        inventory.put(roomType, newCount);
    }

    /**
     * Method to display complete inventory
     */
    public void displayInventory() {

        System.out.println("\n--- Current Room Inventory ---");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " rooms available");
        }
    }
}



/* ---------------- MAIN APPLICATION ---------------- */

public class book_my_stay {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" Welcome to Book My Stay ");
        System.out.println(" Hotel Booking System v3.1 ");
        System.out.println("======================================");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display initial inventory
        inventory.displayInventory();

        // Example availability lookup
        System.out.println("\nChecking availability for Double Room...");
        int available = inventory.getAvailability("Double Room");
        System.out.println("Double Rooms Available: " + available);

        // Example update
        System.out.println("\nUpdating availability after booking...");
        inventory.updateAvailability("Double Room", available - 1);

        // Display updated inventory
        inventory.displayInventory();

        System.out.println("\nApplication finished successfully.");
    }
}