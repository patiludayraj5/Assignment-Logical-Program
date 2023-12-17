public class BankAccount {
    private int Balance;
    int n;
    int w;

    public int getBalance() {
        Balance+=deposit(n);
        Balance-=withdraw(w);
        return Balance;
    }

    public int deposit(int n){
        this.n=n;
        return n;
    }
    public int withdraw(int w){
        this.w=w;
        return w;
    }

   public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.deposit(1000);
       System.out.println(b.getBalance());
       b.withdraw(200);
       System.out.println(b.getBalance());
    }
}

//Write Java program class name BankAccount that represents a simple model of a bank account.
// This class has a private member variable balance, along with public methods to access and
// modify that balance (getBalance, deposit, withdraw).