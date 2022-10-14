package Homework10;

    public class BankAccount {
        private int Balance =0;

        public int getBalance(){
            System.out.println("Your current balance is "+ Balance);
            return Balance;
        }
        public void setBalance(int Balance) {
            if((this.Balance + Balance)>=0) {
                this.Balance +=Balance;
                System.out.println("Your balance has changed by " + Balance + " and now is: " + this.Balance);
                } else {
                System.out.println("Withdrawal of "+ Balance + " cannot be completed. Your balance is " + this.Balance);
                }
        }

        public static void main(String[]args){
            BankAccount myAccount = new BankAccount();
            myAccount.getBalance();
            myAccount.setBalance(500);
            myAccount.setBalance(150);
            myAccount.setBalance(35);
            myAccount.setBalance(-40);
            myAccount.setBalance(-120);
            myAccount.setBalance(-900);
        }

}
