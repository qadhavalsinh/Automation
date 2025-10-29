import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(int shortage) {
        super("Sorry, insufficient balance, you need more " + shortage + " Rs. to perform this transaction.");
    }
}

public class BankAccount {
    private static int balance = 2000;

    public static void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            int shortage = amount - balance;
            throw new InsufficientBalanceException(shortage);
        } else {
            balance -= amount;
            System.out.println("Transaction successful! Remaining balance: " + balance + " Rs.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Account balance is: " + balance + " Rs.");

        System.out.print("Enter withdraw amount: ");
        int amount = scanner.nextInt();

        try {
            withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
