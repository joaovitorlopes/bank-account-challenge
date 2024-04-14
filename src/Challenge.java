import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        String name = "Fulano de Tal";
        String accountType = "Current Account";
        double balance = 2000;
        int option = 0;

        System.out.println("******************************");
        System.out.printf("\nClient Name: %s%n", name);
        System.out.printf("Account Type: %s%n", accountType);
        System.out.printf("Current Balance: R$%.2f%n", balance);
        System.out.println("\n******************************");

        String menuOption = """
                1 - Check Balance
                2 - Withdraw Balance
                3 - Deposit Balance
                4 - Exit
                """;

        while (option != 4) {
            System.out.println(menuOption);
            option = reading.nextInt();

            if (option == 1) {
                System.out.printf("Current Balance: R$%.2f%n", balance);
            } else if (option == 2) {
                System.out.println("Enter how much do you want to WITHDRAW:");
                double withdraw = reading.nextDouble();
                if (withdraw > balance) {
                    System.out.printf("Your current balance is lower than R$%.2f%n",withdraw);
                } else {
                    balance -= withdraw;
                    System.out.printf("Withdraw made successfully, Current Balance: R$%.2f%n", balance);
                }
            } else if (option == 3) {
                System.out.println("Enter how much do you want to DEPOSIT:");
                double deposit = reading.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.printf("Deposit made successfully, Current Balance: R$%.2f%n", balance);
                } else {
                    System.out.println("Invalid Entry");
                }
            } else if (option == 4){
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid Entry");
            }
        }
    }
}
