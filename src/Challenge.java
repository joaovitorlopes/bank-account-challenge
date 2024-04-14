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
        }
    }
}
