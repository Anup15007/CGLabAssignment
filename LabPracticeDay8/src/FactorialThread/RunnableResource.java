package FactorialThread;
public class RunnableResource implements Runnable{
	int num = (int)(Math.random()*10+1);
	@Override
	public synchronized void run() { 
		Thread th = Thread.currentThread();
		if(th.getName().equals("NumberThread"))
		{
			try { 
				notify();
				System.out.println("Number:  "+num);
				wait();
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		if(th.getName().equals("FactorialThread"))
		{    
			try  { 
				notify();
				int j=0,fact=1;  
				int number=num;   
				for(j=1;j<=number;j++){    
					fact=fact*j;    
				}    
				System.out.println("Factorial of "+number+" is: "+fact); 
				wait();
			}  catch(InterruptedException e){e.printStackTrace();}

		}
	}
}