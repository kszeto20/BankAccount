public class BankTester{
  public static void main(String[] args){
    BankAccount acc1 = new BankAccount(123456, "hello");

    System.out.println(acc1.getBalance());
    System.out.println(acc1.getAccountID());
    acc1.setPassword("heyhey");
    System.out.println(acc1.getPassword());
    System.out.println(acc1.deposit(20.0));
    System.out.println(acc1.getBalance());
    System.out.println(acc1.deposit(20.0));
    System.out.println(acc1.getBalance());
    System.out.println(acc1.deposit(-4.7949786));
    System.out.println(acc1.getBalance());
  }
}
