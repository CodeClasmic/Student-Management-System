import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline

            switch (choice) {
                case 1:
                    manager.addStudent(scanner);
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    manager.searchStudentById(scanner);
                    break;
                case 4:
                    manager.deleteStudent(scanner);
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
