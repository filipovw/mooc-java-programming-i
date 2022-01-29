
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account MattAccount = new Account ("Matthews account", 1000.0);
        Account MyAccount = new Account("My account", 0.0);
        MattAccount.withdrawal(100);
        MyAccount.deposit(100);
        System.out.println(MattAccount);
        System.out.println(MyAccount);
    }
}
