package ua.vodafone.homeworks.classes.login;

public class UserRunner {
        public static void main(String[] args) {
            int errorCount = 0;
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            try {
                while (errorCount < 3) {
                    System.out.println("Enter login:");
                    String login = scanner.nextLine();
                    System.out.println("Enter password:");
                    String password = scanner.nextLine();
                    System.out.println("Confirm password:");
                    String confirmPassword = scanner.nextLine();

                    try {
                        User user = new User(login, password, confirmPassword);
                        System.out.println("User created successfully!");
                        break;
                    } catch (WrongLoginException | WrongPasswordException e) {
                        errorCount++;
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            } finally {
                scanner.close();
                System.out.println("Thank you for using our service.");
            }
        }
}
