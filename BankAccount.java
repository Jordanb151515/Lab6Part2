
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;
    private double monthlyIntRate;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        monthlyIntRate = 0.035/12;
    }

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(double inBalance, double intRate)
    {
        monthlyIntRate = (intRate/100)/12;
        balance = inBalance;
    }

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(String inBalance, String intRate)
    {
        monthlyIntRate = (Double.parseDouble(intRate)/100)/12;
        balance =  Double.parseDouble(inBalance);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void makeDeposit(double add)
    {
        deposit =+ add;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void makeDeposit(String add)
    {
        deposit =+ Double.parseDouble(add);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void makeWithdraw(double sub)
    {
        withdraw =+ sub;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void makeWithdraw(String sub)
    {
        withdraw =+ Double.parseDouble(sub);
    }
}
