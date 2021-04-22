package laxmiCSC123Sp21Mid2;

public class FirstClassPassenger extends Passenger
{
	private String freqFlyer;
	
	public FirstClassPassenger()
	{
		super("First");
		setFreqFlyer();
		
	}
	@Override
	public void setFreqFlyer() 
	{
		if(ticketNumber % 2 !=0)
		{
			freqFlyer = "YFF";
		}
		else
		{
			freqFlyer="NFF";
		}
	}

	@Override
	public String getFreqFlyer() 
	{
		return freqFlyer;
	}
	
	public String toString()
	{
		return super.toString() + "_" + getFreqFlyer();
	}

}
