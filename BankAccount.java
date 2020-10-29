public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount (int a, String p) {
    accountID = a;
    balance = 0.0;
    password = p;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

}
