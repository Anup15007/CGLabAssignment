package TimeThread;
public class TimeThread implements Runnable{
	public static void main(String[] args) {
		TimeThread timer = new TimeThread();
		Thread thread = new Thread(timer);
		thread.start();
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Timer: "+i);
		}
	}
}
