package PersonValidation;

public class EmptyNameException extends RuntimeException
{
	public EmptyNameException() 
	{
		super();
	}
	public EmptyNameException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmptyNameException(String message, Throwable cause) 
	{
		super(message, cause);
	}

	public EmptyNameException(String message) 
	{
		super(message);
	}

	public EmptyNameException(Throwable cause) 
	{
		super(cause);
	}
	
}
