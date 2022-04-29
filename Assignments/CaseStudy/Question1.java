package CaseStudy;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Bank bank= new Bank();
        Scanner sc =new Scanner(System.in);
        int choice=0;
        double debitAmount,creditAmount;
        do{
            debitAmount=creditAmount=0;
            System.out.println("1. Debit");
            System.out.println("2. Credit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the amount you want to Withdraw");
                    debitAmount=sc.nextDouble();
                    System.out.println("Your Current Balance is :" +bank.debit(debitAmount));
                    break;
                case 2:
                    System.out.println("Enter the amount you want to Deposit");
                    creditAmount=sc.nextDouble();
                    System.out.println("Your Current Balance is :"+bank.credit(creditAmount));
                    break;
                case 3:
                    System.out.println("Your Current Balance is :"+bank.currentBalance());
                    break;

                default:
                    System.out.println("Invalid Choice!!!");
            }
        }while(choice!=3);
        System.out.println("Thank You for using DevBank");
        sc.close();
    }
}
interface BankingSystem
{
    double debit(double debitAmount);
    double credit(double creditAmount);
    double currentBalance();
}
class Bank implements BankingSystem
{
    private double balance=10000;
    final private double minBalance=5000;

    public double debit(double debitAmount)
    {
        if((this.balance-debitAmount) >= minBalance)
        {
            this.balance -= debitAmount;
            System.out.println ("Amount "+debitAmount+" Debited Successfully");
            return this.balance;
        }
        else{
            System.out.println("You don't have sufficient balance!!!");
            return this.balance;
        }
    }
    public double credit(double creditAmount)
    {
        this.balance  =this.balance + creditAmount;
        System.out.println("Amount "+creditAmount+" Credited Successfully");
        return this.balance;
    }
    public double currentBalance()
    {
        return balance;
    }

}