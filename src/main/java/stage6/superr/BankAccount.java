package stage6.superr;

public class BankAccount {
    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }

    public class CheckingAccount extends  BankAccount{
        double fee;

        public CheckingAccount(String number, Long balance, double fee) {
            super(number, balance);
            this.fee = fee;
        }
    }

    public class SavingAccount extends BankAccount{
        double interestRate;

        public SavingAccount(String number, Long balance, double interestRate) {
            super(number, balance);
            this.interestRate = interestRate;
        }
    }

    public static void main(String[] args) {

    }
}
