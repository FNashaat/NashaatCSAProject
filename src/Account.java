public class Account {
    private double savings;
    private double checkings;
    private Customer customer;


    public Account(Customer customer){
        savings = 0;
        checkings = 0;
        this.customer = customer;
        String account = customer.getName();
    }
    public void addMoney(String account, double amount){
        if(account.equals("savings")){
            savings += amount;
        } else if(account.equals("checkings")){
            checkings += amount;
        } else{
            System.out.println("This option is invalid! Choose either your savings or checkings account!");
        }
    }


    public void removeMoney(String account, double amount){
        if(account.equals("savings")){
            savings -= amount;
        } else if(account.equals("checkings")){
            checkings -= amount;
        } else{
            System.out.println("This option is invalid! Choose either your savings or checkings account!");
        }
    }


    public double getSavings(){
        return savings;
    }


    public double getCheckings(){
        return checkings;
    }




}