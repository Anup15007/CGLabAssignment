package Transaction;
public class SavingsAccount extends Account
{
	double minBalance;
	public double getMinBalance() 
	{
		return minBalance;
	}
	public void setMinBalance(double minBalance) 
	{
		this.minBalance = minBalance;
	}
	public void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Not Sufficient Funds.");
		}
		else if(balance - amount<minBalance)
		{
			System.out.println("Txn Unsuccessful due to Low Balance");
		}
		else 
		{
			balance  = balance - amount;
			System.out.println("Txn Successful. Available Balance : "+ balance);
		}
	}
}
