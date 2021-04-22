package laxmiCSC123Sp21Mid2;

public abstract class Passenger 
{
	public String passengerID;
	public String ticketClass;
	public int ticketNumber;
	public static int ticketCounter =0;
	
	public Passenger(String ticktClass)
	{
		setTicketNumber();
		setTicketClass(ticktClass);
		setPassengerID();
	}
	
	public void setTicketNumber()
	{
		ticketCounter++;
		ticketNumber = ticketCounter;
	}
	
	public void setTicketClass(String tClass)
	{
		ticketClass = tClass;
	}
	
	public void setPassengerID()
	{
		passengerID = "PID"+ ticketClass+ticketNumber;
	}
	
	public int getTicketNumber()
	{
		return ticketNumber;
	}
	
	public String getTicketClass()
	{
		return ticketClass;
	}
	
	public String getPassengerID()
	{
		return passengerID;
	}
	
	public String toString()
	{
		return String.format("%s", passengerID);
	}
	
	public int compareTo(Object pasngr)
	{
		return 0;
	}
	
	public abstract void setFreqFlyer();
	public abstract String getFreqFlyer();
}
