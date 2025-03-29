import java.util.Scanner;

public class SimpleParkingLot {
    static String[] parkingSlots = new String[50]; // 50 slots
    static int[] entryHours = new int[50]; // Store entry hour as number (14 for 2pm)
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Simple Parking Lot System (₹50/hour, ₹500 max daily)");
        
        while(true) {
            System.out.println("\n1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Check Available Slots");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
                case 1:
                    parkVehicle();
                    break;
                case 2:
                    removeVehicle();
                    break;
                case 3:
                    checkSlots();
                    break;
                case 4:
                    System.out.println("Thank you for using our parking lot!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void parkVehicle() {
        System.out.print("Enter vehicle number: ");
        String plate = scanner.nextLine();
        
        System.out.print("Enter entry hour (0-23): ");
        int hour = scanner.nextInt();
        scanner.nextLine(); // Clear input
        
        for(int i = 0; i < parkingSlots.length; i++) {
            if(parkingSlots[i] == null) {
                parkingSlots[i] = plate;
                entryHours[i] = hour;
                System.out.println("Vehicle parked in slot " + (i+1));
                System.out.println("Entry hour: " + hour + ":00");
                return;
            }
        }
        System.out.println("Parking lot is full!");
    }

    static void removeVehicle() {
        System.out.print("Enter vehicle number: ");
        String plate = scanner.nextLine();
        
        System.out.print("Enter exit hour (0-23): ");
        int exitHour = scanner.nextInt();
        scanner.nextLine(); // Clear input
        
        for(int i = 0; i < parkingSlots.length; i++) {
            if(plate.equals(parkingSlots[i])) {
                double fee = calculateFee(entryHours[i], exitHour);
                
                System.out.println("\nVehicle details:");
                System.out.println("Slot: " + (i+1));
                System.out.println("Entry: " + entryHours[i] + ":00");
                System.out.println("Exit: " + exitHour + ":00");
                System.out.println("Parking fee: ₹" + fee);
                
                parkingSlots[i] = null;
                entryHours[i] = 0;
                return;
            }
        }
        System.out.println("Vehicle not found in parking lot");
    }

    static void checkSlots() {
        int available = 0;
        for(String slot : parkingSlots) {
            if(slot == null) available++;
        }
        System.out.println("Available parking slots: " + available);
        System.out.println("Occupied slots: " + (parkingSlots.length - available));
    }

    static double calculateFee(int entryHour, int exitHour) {
        int hours = exitHour - entryHour;
        if(hours < 0) hours += 24; // Handle overnight
        
        double fee = hours * 50; // ₹50 per hour
        return fee > 500 ? 500 : fee; // Max ₹500
    }
}