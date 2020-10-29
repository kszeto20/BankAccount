public class BankTester{
  public static void main(String[] args){
    BankAccount acc1 = new BankAccount(123456, "hello");

    System.out.println(acc1.getBalance());
    System.out.println(acc1.getAccountID());
  }
}
