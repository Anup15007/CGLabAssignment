package CopyThreadData;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyThreadData implements Runnable{

	public static void main(String...args)
	{
		Thread thread = new Thread();
		thread.start();
	}
	@Override
	public void run() 
	{
		FileReader fileSource=null;
		FileWriter fileTarget=null;
		try{
			fileSource = new FileReader("/D:/source.txt");
			fileTarget = new FileWriter("/D:/Target.txt");
			int allContent;
			int characterRead=0;
			while((allContent=fileSource.read())!=-1)
			{
				fileTarget.write(allContent);
				++characterRead;
				if(characterRead==10){
					System.out.println("10 character has been copied.");
					characterRead=0;
				}
			}

		}
		catch(IOException e){e.printStackTrace();}
		finally
		{
			if(fileSource!=null)
				try {
					fileSource.close();
				} 
			catch (IOException e) {
				e.printStackTrace();
			}
			if(fileTarget!=null)
				try {
					fileTarget.close();
				} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



