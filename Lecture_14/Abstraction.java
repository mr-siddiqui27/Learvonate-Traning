package Lecture_14;

abstract class Bank{
    abstract void deposit(long amount);
    abstract void withdraw(long amount);

    void checkBalance(long balance){
        System.out.println("Balance :"+ balance);
    }
}

class HDFCBank extends Bank{
    private long balance =0;

    void deposit(long amount){
        this.balance +=amount;
        System.out.println("deposited: "+amount);
        checkBalance(balance);
    }
    void withdraw(long amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
        checkBalance(balance);
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Bank bank = new HDFCBank();
        bank.deposit(10000);
        bank.withdraw(500);
    }
}
