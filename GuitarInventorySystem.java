import java.util.Scanner;

public class GuitarInventorySystem {
    public static void main(String[] args) {
        GuitarInventory inventory = new GuitarInventory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Guitar Inventory System");
            System.out.println("1. Add Guitar");
            System.out.println("2. View Guitars");
            System.out.println("3. Find Guitar by Model");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter type (electric/acoustic): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    inventory.addGuitar(new Guitar(brand, model, type, price, quantity));
                    System.out.println("Guitar added successfully!");
                    break;

                case 2:
                    System.out.println("Guitars in Inventory:");
                    inventory.viewGuitars();
                    break;

                case 3:
                    System.out.print("Enter model to find: ");
                    String searchModel = scanner.nextLine();
                    Guitar foundGuitar = inventory.findGuitar(searchModel);
                    if (foundGuitar != null) {
                        System.out.println("Found: " + foundGuitar);
                    } else {
                        System.out.println("Guitar not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
