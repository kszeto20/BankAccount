public class BankTester{
  public static void main(String[] args){
    BankAccount acc1 = new BankAccount(5213452, "hello");
    BankAccount acc2 = new BankAccount(12345678, "hello");

    System.out.println(acc1.getBalance());
    System.out.println(acc1.getAccountID());
    acc1.setPassword("heyhey");
    System.out.println(acc1.deposit(20.0));
    System.out.println(acc1.deposit(20.0));
    System.out.println(acc1.deposit(-4.7949786));
    System.out.println(acc1.withdraw(20.0));
    System.out.println(acc1.withdraw(20.234));
    System.out.println(acc1.withdraw(-1.1));
    System.out.println(acc1.toString());
    System.out.println(acc1.authenticate("heyhey"));
    System.out.println(acc1.transferTo(acc2, 15.0, "heyhey"));
    System.out.println(acc2.toString());
    System.out.println(acc1.toString());
    System.out.println(acc1.transferTo(acc2, 15.0, "heyhey"));
    System.out.println(acc2.toString());
    System.out.println(acc1.toString());
  }
}
