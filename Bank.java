public class BankAccount {
    public double balance;

    public Bank(){
        this.balance = 0;
    }

    public void deposit(double deposit){
        this.balance = this.balance + deposit;
    }

    public void withdraw(double withdraw){
        this.balance = this.balance - withdraw;
    }

    public double getBalance(){
        return this.balance;
    }

    public void addInterest(double rate) { balance = balance+( ( balance * rate )/100); }




}
