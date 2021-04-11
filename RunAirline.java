package Exams;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class RunAirline
{
	public static void main(String [] args) throws IOException
	{
			ArrayList<Flight> flightList = new ArrayList<>();
			Scanner keyboard = new Scanner(System.in);
			String flightName;
			int seed;
			for(int i=0; i<4; i++)
			{
				System.out.printf("Please enter the Flight Name: \n");
				flightName = keyboard.nextLine();
				System.out.printf("Please enter an integer seed from 1 to 50: \n");
				seed = keyboard.nextInt();
				flightList.add(new Flight(flightName, seed));
				keyboard.nextLine();
			}
			System.out.printf("Please enter the name of the output file: ");
			String outputFileName = keyboard.nextLine();
			File outputFile = new File(outputFileName);
			PrintWriter outputWriter = new PrintWriter(outputFile);
			
			for(Flight tempFlight : flightList)
			{
				tempFlight.sellSeats();
				tempFlight.lineUpCall();
				tempFlight.boarding(outputWriter);
				outputWriter.printf("\n\n");
			}
			outputWriter.close();
			keyboard.close();
		}
}
