public class CurrentAccount extends Account
{
	double overDftLim;
	public double getOverDftLim() 
	{
		return overDftLim;
	}
	public void setOverDftLim(double overDftLim) 
	{
		this.overDftLim = overDftLim;
	}
	public void withdraw(double amount)
	{
		boolean status;
		status = checkOvDft(amount);
		
		if(status==true)
		{
			balance  = balance - amount;
			System.out.println("Txn Successful. Available Balance : "+ balance);
		}
	}
	public boolean checkOvDft(double amount)
	{
		boolean status;
		if(amount>overDftLim)
		{
			System.out.println("Not Sufficient Funds.");
			status  = false;
		}
		else if(balance - amount<overDftLim)
		{
			System.out.println("Txn Unsuccessful due to Low Balance");
			status  = false;
		}
		else 
		{
			balance  = balance - amount;
			System.out.println("Txn Successful. Available Balance : "+ balance);
			status  = true;
		}
		return status;
	}
}
