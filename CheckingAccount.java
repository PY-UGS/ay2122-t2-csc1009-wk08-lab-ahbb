public class CheckingAccount 
{
    private double balance;
    private int accountNo;

    public double getBalance() 
    {
        return this.balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public int getNumber() 
    {
        return this.accountNo;
    }

    public void setNumber(int accountNo) 
    {
        this.accountNo = accountNo;
    }

    public void deposit(double amount)
    {
        this.balance +=amount;
    }

    public double withdraw(double amount)
    {
        this.balance -=amount;

        if (this.balance<0)
        {
            return this.balance;
        }
        else
        {
            return 0; //if account has enough balance, return 0
        }
    }
}
