import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> employeeIDs = new ArrayList<>();

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();

                    employeeIDs.add(id);

                    System.out.println("Employee ID added.");
                    break;

                case 2:
                    System.out.print("Enter employee ID to remove: ");
                    int removeID = sc.nextInt();

                    boolean found = false;

                    // Check each employee ID one by one
                    for (int i = 0; i < employeeIDs.size(); i++) {
                        if (employeeIDs.get(i).equals(removeID)) {
                            employeeIDs.remove(i);
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("Employee ID removed.");
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                    break;

                case 3:
                    System.out.println("Employee IDs:");

                    for (int i = 0; i < employeeIDs.size(); i++) {
                        System.out.print(employeeIDs.get(i) + " ");
                    }

                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}