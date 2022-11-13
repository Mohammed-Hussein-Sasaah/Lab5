/*3. Write a BankAccountTester class whose main method constructs a bank account,
deposits $1,000, withdraws $500, withdraws another $400, and then prints the
remaining balance. Also print the expected result.
*/

public class BankTester {
    public static void main(String[] args){
        BankAccount BC = new BankAccount();
        BC.deposit(1000);
        BC.withdraw(500);
        BC.withdraw(400);

        System.out.println(BC.getBalance());
        System.out.println(" expected result : 100$ ");

    }
}
