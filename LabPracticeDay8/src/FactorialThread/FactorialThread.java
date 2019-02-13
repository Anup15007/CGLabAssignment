package FactorialThread;
public class FactorialThread {
	public static void main(String[] args) {
		RunnableResource resource = new RunnableResource();
		Thread th1 = new Thread(resource,"NumberThread");
		Thread th2 = new Thread(resource,"FactorialThread");

		try {
			th1.start();
			th2.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		th2.start();

	}
}
