package Transaction;

public abstract class Account
{
	long accNum;
	double balance; 
	Person accHolder;
	static int count = 1;
	public void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Not Sufficient Funds.");
		}
		else if(balance - amount<500)
		{
			System.out.println("Txn Unsuccessful due to Low Balance");
		}
		else balance  = balance - amount;
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public long getAccNum() 
	{
		return accNum;
	}
	public void setAccNum() 
	{
		this.accNum = count;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public Person getAccHolder() 
	{
		return accHolder;
	}
	public void setAccHolder(Person accHolder) 
	{
		this.accHolder = accHolder;
	}	
}
