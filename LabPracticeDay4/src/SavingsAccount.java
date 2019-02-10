public class SavingsAccount extends Account
{
	final double minBalance = 500;
	public double getMinBalance() 
	{
		return minBalance;
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
