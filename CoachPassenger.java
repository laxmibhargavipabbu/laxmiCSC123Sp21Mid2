package laxmiCSC123Sp21Mid2;

public class CoachPassenger extends Passenger
{
private String freqFlyer;
	
	public CoachPassenger()
	{
		super("Coach");
		setFreqFlyer();
	}
	
	@Override
	public void setFreqFlyer() 
	{
		if(ticketNumber % 2 !=0)
		{
			freqFlyer = "YFC";
		}
		else
		{
			freqFlyer="NFC";
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
