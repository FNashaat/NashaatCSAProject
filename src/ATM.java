import java.util.Scanner;
public class ATM {
    private Customer customer;
    private Account account;
    private TransactionHistory transactionHistory;
    private Scanner scanner;

    public ATM(){
        this.transactionHistory = new TransactionHistory();
        this.scanner = new Scanner(System.in);
    }

    public void start(){

    }


}

