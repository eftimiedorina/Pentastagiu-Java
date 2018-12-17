package Exercice2;

public class bankAccount {
     private  double amount;
     //private double withdrawAmount;
     private static int operation = 0;

     public bankAccount(){
         this.amount = 0;

     }

    public bankAccount(double amount) {
        this.amount = amount;
        operation++;
        System.out.println("Bank account is called -> "+operation);
    }

    public void withdraw(double withdrawAmount) {
        if(withdrawAmount <= this.amount){
            this.amount -= withdrawAmount;
            System.out.println("Withdraw of "+withdrawAmount +" processed. Remaning deposit -> "+this.amount);
        } else{
            System.out.println("ERROR! Only "+this.amount+" avabile! Withdraw not processed!");

        }

    }

    public void deposit(double amount) {
        this.amount += amount;
        System.out.println("Current deposit -> "+this.amount);
    }



    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount += amount;
        operation++;
        System.out.println("Bank account is called -> "+operation);
    }
}
