import java.util.Scanner;

public class BankDemoTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double amtShort;

        CheckingAccount acc1 = new CheckingAccount();
        acc1.setNumber(1);
        acc1.setBalance(1000); //setting initial balance

        System.out.println("Enter amount to deposit into account "+acc1.getNumber()+": ");
        acc1.deposit(input.nextDouble());
        System.out.println("Balance after deposit is "+acc1.getBalance());
        
        try
        {
            System.out.println("Enter amount to withdraw from account "+acc1.getNumber()+": ");
            amtShort = acc1.withdraw(input.nextDouble());
            input.close();

            if (amtShort == 0)
            {
                System.out.println("The balance after withdraw is: $"+ acc1.getBalance());
            }

            else
            {
                throw new InsufficientFundsException(amtShort);
            }
        }
        catch (InsufficientFundsException e)
        {
            System.out.println(e.toString());
        }
    }
}