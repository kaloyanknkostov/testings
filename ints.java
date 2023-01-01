public class ints {
   public ints(double initialBalance) {
      if (initialBalance < 0) {
         throw new IllegalArgumentException("Initial balance cannot be negative.");
      }
      balance = initialBalance;
   }
   public void deposit(double amount) {
      if (amount < 0) {
         throw new IllegalArgumentException("Cannot deposit a negative amount.");
      }
      double newBalance = balance + amount;
      balance = newBalance;
   }
   public void withdraw(double amount) {
      if (amount < 0 || amount > balance) {
         throw new IllegalArgumentException("Cannot withdraw an amount greater than the current balance or a negative amount.");
      }
      double newBalance = balance - amount;
      balance = newBalance;
   }
   public double getBalance() {
      return balance;
   }
   private double balance;
   
   public void catchEmAll() {
      // Implement this method to catch the IllegalArgumentExceptions and handle 

   }

   public static void main(String[] args) {
      System.out.println("yikes");
   }
}