import java.util.*;
public class ATM_Interface{
    public class User_Bank_Account{
        private double bank_balance;
        public User_Bank_Account(double starting_amount){
            bank_balance= starting_amount;
        }
        public double check_balance(){
            return bank_balance;
        }
        public void deposite_amount(double amount){
            if (amount >0){
                bank_balance += amount;
                System.out.println("The amount that you have deposited in your account is: ." + amount + " Rupees" );
            }
            else{
                System.out.println("Please desposite amount greater than 0 rupees");
            }
        }
        public void withdraw_amount( double amount){
            if(amount>0 && amount<= bank_balance){
                bank_balance -= amount;
                System.out.println("The amount that you have withdrawn from your account is: " + amount + " Rupees");

            }
            else if(amount> bank_balance){
                System.out.println("Insufficient Bank Balance!");
            }
            else{
                System.out.println("Please withdraw amount greater than 0 rupees");

            }
        }

    }
    public class ATM_Machine{
        private User_Bank_Account uba;
        public ATM_Machine(User_Bank_Account uba){
            this.uba= uba;
        }
        public void ATM_Menu() {
            System.out.println("&*&*&*&*&*&*&*&*&*&_Welcome to the ATM Machine!_&*&*&*&*&*&*&*&*&*&");
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposite");
            System.out.println("4. Exit");
        }
        public void Start_ATM() {
        Scanner scan = new Scanner(System.in);
        int option;

        do {
            ATM_Menu();
            System.out.print("Select an option from 1 to 4: ");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your current bank balance is Rupees: " + uba.check_balance());
                    break;
                case 2:
                    System.out.print("Enter the amount you want to withdraw: ");
                    double withdrawl_money = scan.nextDouble();
                    uba.withdraw_amount(withdrawl_money);
                
                    break;

                    
                case 3:
                    System.out.print("Enter the amount you want to deposite: ");
                    double dep_money = scan.nextDouble();
                    uba.deposite_amount(dep_money);
                    break;
                    
                case 4:
                    System.out.println("Exiting from the ATM Machine! Hope you have a wonderful day ahead.");
                    break;
                default:
                    System.out.println("Invalid option selected. Please select a valid option.");
            }
        } while (option != 4);

        scan.close();
    }
}
    public static void main(String[] args) {
    ATM_Interface atm_in= new ATM_Interface();
    User_Bank_Account user = atm_in.new User_Bank_Account(100000.0); // Initialize the user's account with $1000
    ATM_Machine atm = atm_in.new ATM_Machine(user);
    atm.Start_ATM();
    }

 } 
  



