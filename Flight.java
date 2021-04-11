package Exams;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Flight 
{
	private String flightName;
	private int seats;
	private int seatsSold;
	private Random randy;
	private ArrayList<Passenger> passBooked = new ArrayList<>();
	private ArrayList<Passenger> boardingQueue = new ArrayList<>();  
	
	public Flight(String flightName, int seed)
	{
		setFlightName(flightName);
		randy = new Random(seed); 
		setSeats();
	}
	
	public void setFlightName(String fName)
	{
		this.flightName = fName;
	}
	
	public void setSeats()
	{
		seats = randy.nextInt(51)+100;
	}
	
	public void sellSeats()
	{
		seatsSold = (seats/2) + randy.nextInt(1+ (seats/2));
		for(int i=0;i<seatsSold;i++)
		{
			int temp = randy.nextInt(6);
			if(temp ==3)
			{
				passBooked.add(new FirstClassPassenger());
			}
			else
			{
				passBooked.add(new CoachPassenger());
			}
		}
	}
	
	public void lineUpCall()
	{
		Iterator <Passenger> iter = passBooked.iterator();
		while(iter.hasNext())
		{
			boardingQueue.add(iter.next());
		}
		
	}
	
	public void boarding(PrintWriter outputWriter) throws IOException
	{
		int counter=1;
		Passenger temp;
		Iterator <Passenger> iter = boardingQueue.iterator();
		outputWriter.printf("The boarding order for Flight %s with %d seats and %d seats sold is:\n", flightName, seats, seatsSold);
		while (iter.hasNext())
		{
			temp = iter.next();
			outputWriter.printf("%-22s\t",temp);
			counter++;
			if(counter % 3==0)
			{
				outputWriter.printf("\n");
				counter = 0;
			}
		}
	}
	
}