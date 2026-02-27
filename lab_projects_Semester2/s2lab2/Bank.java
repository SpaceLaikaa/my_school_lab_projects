package lab_projects_Semester2.s2lab2;

import java.util.Scanner;

//Q1 = Constructor lets us access the private variables from an another class.
//Q2 =

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount1 = new BankAccount("Arda", 12345678912);
        System.out.println("-----------------");
        System.out.println("1. Deposit"); System.out.println("2. Withdraw");
        System.out.println("3. Check Balance"); System.out.println("4. Exit");
        System.out.println("-----------------");
        String userChoice = sc.nextLine();

        if(userChoice.equalsIgnoreCase("1")||userChoice.equalsIgnoreCase("deposit")){
            System.out.println("How much money do you want to deposit ?");
            int userDepositChoice = sc.nextInt();
            bankAccount1.deposit(userDepositChoice);
        }

    }
}

    class BankAccount {
        String ownerName;
        long iban;
        double balance=0;


        public BankAccount(String ownerName, long iban) {
            String stringIban = iban+"";
            if( stringIban.length() == 11){
                this.balance = 0;
                this.iban = iban;
                this.ownerName = ownerName;
            }
            else{
                System.out.println("Please enter a valid IBAN");
            }

        }

        public void setBalance(double balance){this.balance = balance;}
        public void setIban(long iban){this.iban=iban;}
        public void setOwnerName(String ownerName){this.ownerName = ownerName;}

        public long getIban(){return iban;}
        public double getBalance(){return balance;}
        public String getOwnerName(){return ownerName;}

        public void deposit(long amount){

        }
    }

