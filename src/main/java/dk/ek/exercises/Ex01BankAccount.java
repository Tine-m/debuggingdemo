package dk.ek.exercises;

/**
 * purpose: to exercise debugging skills
 * 1. Use main method OR Create a junit test for this class
 * 2. Set up a test that asserts false for the withdraw method call
 *  (if you use main method, simply call method and see result in console window)
 * 3. Set appropriate breakpoint(s)
 * 3. Run the debugger from inside the test and find out why withdraw() is not producing 'false'
 */
public class Ex01BankAccount {
    private double balance;

    public Ex01BankAccount(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (balance < amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Ex01BankAccount acc = new Ex01BankAccount(100);
        boolean result = acc.withdraw(120);  // should fail, but succeeds
        System.out.println("Balance: " + acc.getBalance());
        if (result) {
            System.out.println("Withdrawal successful.");
        }
        else {
            System.out.println("Insufficient funds.");
        }
     }
}
