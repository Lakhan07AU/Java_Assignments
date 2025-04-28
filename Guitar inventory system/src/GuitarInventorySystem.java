import java.util.Scanner;
public class GuitarInventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        while (true) {
            System.out.println("\n--- Guitar Inventory System ---");
            System.out.println("1. Add Guitar");
            System.out.println("2. Remove Guitar");
            System.out.println("3. Display Inventory");
            System.out.println("4. Search Guitar");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Guitar Brand: ");
                    String brand = scanner.nextLine();

                    System.out.print("Enter Guitar Model: ");
                    String model = scanner.nextLine();

                    System.out.print("Enter Guitar Type (Acoustic/Electric/Bass): ");
                    String type = scanner.nextLine();

                    System.out.print("Enter Guitar Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Serial Number: ");
                    String serialNumber = scanner.nextLine();

                    Guitar newGuitar = new Guitar(brand, model, type, price, serialNumber);
                    inventory.addGuitar(newGuitar);
                    break;

                case 2:
                    System.out.print("Enter Serial Number to Remove: ");
                    String removeSerial = scanner.nextLine();
                    inventory.removeGuitar(removeSerial);
                    break;

                case 3:
                    inventory.displayInventory();
                    break;

                case 4:
                    System.out.print("Enter Serial Number to Search: ");
                    String searchSerial = scanner.nextLine();
                    inventory.searchGuitar(searchSerial);
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}