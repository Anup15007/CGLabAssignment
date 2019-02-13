package ElectronicShop;
public class MainClass {
	public static void main(String[] args) {
		ElectronicShopCommunication resource = new ElectronicShopCommunication();
		Thread th1 = new Thread(resource,"Customer");
		Thread th2 = new Thread(resource,"BillingPerson");
		try {
			th2.start();
			th1.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		th1.start();
	}
}
