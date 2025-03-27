
/**
 * The BankAccount class includes constructors, methods for making deposits, making withdraws,
 * calculating interest, and retriving all of these fields including the final balance. 
 *
 * @author Jordan Byrne
 * @version v1.0
 * @since 3/20/25
 */
public class BankAccount
{
    // field variables
    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;
    private double monthlyIntRate;

    /**
     * BankAccount constructor for no arguments. Sets interest rate to 3.5 percent.
     */
    public BankAccount()
    {
        monthlyIntRate = 0.035/12;
    }

    /**
     * BankAccount constructor for console. Sets interest rate and balance.
     * @param inBalance takes input of the starting balance.
     * @param intRate takes input of the annual interest rate.
     */
    public BankAccount(double inBalance, double intRate)
    {
        monthlyIntRate = (intRate/100)/12;
        balance = inBalance;
    }

    /**
     * BankAccount constructor for GUI. Sets interest rate and balance.
     * @param inBalance takes input of the starting balance.
     * @param intRate takes input of the annual interest rate.
     */
    public BankAccount(String inBalance, String intRate)
    {
        monthlyIntRate = (Double.parseDouble(intRate)/100)/12;
        balance =  Double.parseDouble(inBalance);
    }

    /**
     * Method take input of the amount deposited and adds to the deposit and balance total. For console.
     *
     * @param add is the input of the amount being deposited. 
     */
    public void makeDeposit(double add)
    {
        deposit += add;
        balance += add;
    }

    /**
     * Method take input of the amount deposited and adds to the deposit and balance total. For GUI.
     *
     * @param add is the input of the amount being deposited.
     */
    public void makeDeposit(String add)
    {
        deposit += Double.parseDouble(add);
        balance += Double.parseDouble(add);
    }

    /**
     * This method accounts for withdraws. It adds to the withdraw total and subtracts from the total balance. For console.
     *
     * @param sub is the input for the ammount being withdrawn.
     */
    public void makeWithdraw(double sub)
    {
        withdraw += sub;
        balance -= sub;
    }

    /**
     * This method accounts for withdraws. It adds to the withdraw total and subtracts from the total balance. For GUI.
     *
     * @param sub is the input for the ammount being withdrawn.
     */
    public void makeWithdraw(String sub)
    {
        withdraw += Double.parseDouble(sub);
        balance -= Double.parseDouble(sub);
    }

    /**
     * This methods calulates the interest based on the current balance.
     * The interest gets added to the interest total and the balance total.
     */
    public void calcInterest()
    {
        if (balance>0){
            interest += (monthlyIntRate*balance);
            balance += (monthlyIntRate*balance);
        }
    }

    /**
     * Method retrives the current balance.
     * 
     * @return balance total
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Method retrives the current deposit amount.
     *
     * @return deposit total
     */
    public double getDeposit()
    {
        return deposit;
    }

    /**
     * Method retrives the current withdraw amount.
     *
     * @return withdraw total
     */
    public double getWithdraw()
    {
        return withdraw;
    }

    /**
     * Method retrives the current interest amount.
     *
     * @return interest total
     */
    public double getInterest()
    {
        return interest;
    }
}
