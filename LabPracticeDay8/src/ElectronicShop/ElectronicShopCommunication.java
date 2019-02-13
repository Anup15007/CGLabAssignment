package ElectronicShop;

public class ElectronicShopCommunication implements Runnable{
	@Override
	public synchronized void run(){
		Thread thread = Thread.currentThread();
		if(thread.getName().equals("Customer")){
			try { 
				System.out.println("Customer giving products to Billing Person");
				notify();
				wait();
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(thread.getName().equals("BillingPerson"))
		{
			try { 
				notify();
				wait();
				System.out.println("Billing Person billing the products");
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

}
