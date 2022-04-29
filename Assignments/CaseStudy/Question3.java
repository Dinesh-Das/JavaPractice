package CaseStudy;

import java.util.Scanner;

public class Question3 {
    SavingsAccount savingsAccount= new SavingsAccount();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Question3 obj = new Question3();
        int choice=0;
        System.out.println("Welcome to The Financial Crimes Bank!!!");
        do
        {   
            System.out.println("***************************************************");
            System.out.println("1. Create Bank Account");
            System.out.println("2. Deposit ");
            System.out.println("3. Withdraw ");
            System.out.println("4. Check Account Balance ");
            System.out.println("5. Check Intrest Amount ");
            System.out.println("6. Exit");
            choice=scanner.nextInt();
            System.out.println("***************************************************");
            switch(choice)
            {
                case 1: obj.createAccount(); break;
                case 2: obj.deposit(); break;
                case 3: obj.withdraw(); break;
                case 4: obj.checkBalance(); break;
                case 5: obj.checkInterestAmount(); break;
                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice!=6);
        scanner.close();
    }

    private void createAccount() {
        System.out.println("Enter Name :");
        savingsAccount.setCustomerName(scanner.nextLine());
        System.out.println("Enter Email :");
        savingsAccount.setCustomerEmail(scanner.nextLine());
        System.out.println("Enter Phone Number :");
        savingsAccount.setCustomerPhone(scanner.nextLine());
        System.out.println("Enter Age :");
        savingsAccount.setCustomerAge(scanner.nextInt());
        System.out.println("Enter Account Number");
        savingsAccount.setAccountNumber(scanner.nextLong());
        System.out.println("Enter Initial Balance");
        savingsAccount.setBalance(scanner.nextDouble());

        System.out.println("Account Created Successfully!");
    }

    private void deposit() {
        System.out.println("Enter Amount To Deposit: ");
        System.out.println(" Amount Deposited Successfully!!! \n Your Current Balance is "+savingsAccount.depositAmount(scanner.nextDouble()));
    }

    private void withdraw() {
        
        System.out.println("Enter Amount To Withdraw: ");
        System.out.println(" Amount Withdrawn Successfully!!! \n Your Current Balance is "+savingsAccount.withdrawAmount(scanner.nextDouble()));
    }

    private void checkBalance() {
        System.out.println("Your Current Balance : "+savingsAccount.checkBalance());
    }

    private void checkInterestAmount() {
        System.out.println("The Intrest Amount :"+savingsAccount.checkInterestAmount());
    }
}
class Customer
{
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private int customerAge;

    Customer()
    {
        this.customerAge=0;
        this.customerEmail="";
        this.customerPhone="";
        this.customerName="";
    }
    void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    void setCustomerEmail(String customerEmail)
    {
        this.customerEmail=customerEmail;
    }
    void setCustomerPhone(String customerPhone)
    {
        this.customerPhone=customerPhone;
    }
    void setCustomerAge(int customerAge)
    {
        this.customerAge=customerAge;
    }

    String getCustomerName()
    {
        return this.customerName;

    }
    String getCustomerEmail()
    {
        return this.customerEmail;
    }
    String getCustomerPhone()
    {
        return this.customerPhone;
    }
    int getCustomerAge()
    {
        return this.customerAge;
    }
}
class CurrentAccount extends Customer
{
   private double balance;
   private long accountNumber;
   
   CurrentAccount()
    {
        this.balance=0;
        this.accountNumber=0;
    }
  
   void setBalance(double balance)
   {
       this.balance=balance;
   }
   void setAccountNumber(long accountNumber)
   {
       this.accountNumber=accountNumber;
   }
   double getBalance()
   {
       return this.balance;
   }
   long getAccountNumber()
   {
       return this.accountNumber;
   }


}
class SavingsAccount extends CurrentAccount{
    private double minimumBalance;
    private double interestRate;

    SavingsAccount()
    {
        this.minimumBalance=5000;
        this.interestRate=5;
    }
    void setMinimumBalance(double minimumBalance)
    {
        this.minimumBalance=minimumBalance;
    }
    void setInterestRate(double interestRate)
    {
        this.interestRate=interestRate;
    }
    double getMinimumBalance()
    {
        return this.minimumBalance;
    }
    double getInterestRate()
    {
        return this.interestRate;
    }

    double withdrawAmount(double withdrawAmount)
    {
        if((super.getBalance()-withdrawAmount) >= this.minimumBalance)
        {
            super.setBalance(super.getBalance()-withdrawAmount);
            return super.getBalance();
        }
        return super.getBalance();
    }
    double depositAmount(double depositAmount)
    {
        super.setBalance(super.getBalance()+depositAmount);
        return super.getBalance();
    }
    double checkBalance()
    {
        return super.getBalance();
    }
    double checkInterestAmount()
    {
            return super.getBalance()*interestRate/100;
    }
   
}
