
public class AccountTest 
{
	public static void main(String[] args) 
	{
		Account Smith = new Account();
		Person perSmith = new Person();
		perSmith.setName("Smith");
		perSmith.setAge(22);
		Smith.setAccHolder(perSmith);
		Smith.setBalance(2000);
		Smith.setAccNum();
		Account Kathy = new Account();
		Person perKathy = new Person();
		perKathy.setName("Kathy");
		perKathy.setAge(20);
		Kathy.setBalance(3000);
		Kathy.setAccNum();
		Smith.deposit(2000);
		System.out.println("Smith Balance : "+ Smith.getBalance());
		Kathy.withdraw(2000);
		System.out.println("Kathy Balance : "+Kathy.getBalance());
		SavingsAccount svAccount = new SavingsAccount();
		svAccount.setBalance(5050);
		svAccount.withdraw(500);
		CurrentAccount curAccount = new CurrentAccount();
		curAccount.setOverDftLim(500);
		curAccount.setBalance(5050);
		curAccount.withdraw(500);
	}

}
