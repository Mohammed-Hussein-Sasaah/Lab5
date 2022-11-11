/*4. Add a method public void addInterest(double rate) to the BankAccount class that
adds interest at the given rate. For example, after the statements
BankAccount momsSavings = new BankAccount(1000);
momsSavings.addInterest(10); // 10 percent interest
Object Oriented Programming Lab 5
the balance in momsSavings is $1,100. Also supply a BankAccountTester class that
prints the actual and expected balance.
*/


public class BankTesterinterest {
    public static void main(String[] args) {
        Bank momsSavings = new Bank(1000);
        momsSavings.addInterest(10);

        System.out.println("the expected :");
        System.out.println("100");
        System.out.println("balance : 1100");
        System.out.println(momsSavings.getBalance());
    }
}