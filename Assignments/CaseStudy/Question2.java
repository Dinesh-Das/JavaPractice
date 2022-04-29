package CaseStudy;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        PersonalInformation pInformation = new PersonalInformation();
        System.out.println("Enter the Employee Name");
        pInformation.setName(sc.nextLine());
        
        System.out.println("Enter the Employee ID");
        pInformation.setId(sc.nextInt());
        sc.nextLine();
        
        System.out.println("Enter the Employee E-Mail");
        pInformation.setEMail(sc.nextLine());
        
        System.out.println("Enter the Employee Phone Number");
        pInformation.setPhone(sc.nextLine());

    
        System.out.println("Enter the Employee Address");
        pInformation.setAddress(sc.nextLine());
        
        System.out.println("Enter the Employee Bank Account Number");              
        pInformation.setBankAccountNumber(sc.nextLong());

        System.out.println("Enter the Employee Passport Number");
        pInformation.setPassportNumber(sc.nextLong());

        System.out.println(pInformation);

        System.out.println("Employee Name                : "+pInformation.getName());
        System.out.println("Employee ID                  : "+pInformation.getId());
        System.out.println("Employee Email               : "+pInformation.getEmail());
        System.out.println("Employee Phone               : "+pInformation.getPhone());
        System.out.println("Employee Address             : "+pInformation.getAddress());
        System.out.println("Employee Bank Account Number : "+pInformation.getBankAccountNumber());
        System.out.println("Employee Passport Number     : "+pInformation.getPassportNumber());

        sc.close();
    }
}

class Employee {
    private String eName;
    private int eId;
    private String eMail;
    private String ePhone;

    void setName(String name) {
        this.eName = name;
    }

    void setId(int id) {
        this.eId = id;
    }

    void setEMail(String email) {
        this.eMail = email;
    }

    void setPhone(String phone) {
        this.ePhone = phone;
    }

    String getName() {
        return this.eName;
    }

    int getId() {
        return this.eId;
    }

    String getEmail() {
        return this.eMail;
    }

    String getPhone() {
        return this.ePhone;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[" + this.eId + " " + this.eName + " " + this.eMail + " " + this.ePhone + "]";
    }
}
class PersonalInformation extends Employee
{
    private String address;
    private long bankAccountNumber;
    private long passportNumber;
    
    void setAddress(String address)
    {
        this.address=address;
    }
    void setBankAccountNumber(long accountNumber)
    {
        this.bankAccountNumber=accountNumber;
    }
    void setPassportNumber(long passportNumber)
    {
        this.passportNumber=passportNumber;
    }
    String getAddress()
    {
        return this.address;
    }
    long getBankAccountNumber()
    {
        return this.bankAccountNumber;
    }
    long getPassportNumber()
    {
        return this.passportNumber;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        
        return "[ "+super.toString()+" "+this.address+" "+this.bankAccountNumber+" "+this.passportNumber+" ]";
    }
}