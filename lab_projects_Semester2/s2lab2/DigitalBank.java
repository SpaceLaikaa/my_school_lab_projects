package lab_projects_Semester2.s2lab2;

public class DigitalBank {
    public static void main(String[] args) {

    }

    public class BankAccount {
        private String ownerName;
        private long iban;
        private double balance;
        private String transactionHistory;

        public BankAccount(String ownerName, long iban,String transactionHistory){
            this.ownerName = ownerName;
            this.iban = iban;
            balance=0;
        }

        public String getOwnerName(){return ownerName;}
        public long getIban(){return iban;}
        public double getBalance(){return balance;}
        public String getTransactionHistory(){return  transactionHistory;}

        public void setOwnerName(String ownerName){this.ownerName=ownerName;}
        public void setIban(long iban){this.iban=iban;}
        public void setTransactionHistory(String transactionHistory){this.transactionHistory=transactionHistory;}
        public void setBalance(double balance){this.balance=balance;}
    }
}

