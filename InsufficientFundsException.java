public class InsufficientFundsException extends Exception
{
    private double amount;

    public InsufficientFundsException(double amount)
    {
        this.amount = -amount; //to get amount short in positive value
    }

    public double getAmount()
    {
        return this.amount;
    }

    public String toString()
    {
        return("Sorry, but your account is short by: $" + this.getAmount());
    }
}