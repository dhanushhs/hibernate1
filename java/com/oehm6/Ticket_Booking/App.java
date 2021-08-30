package com.oehm6.Ticket_Booking;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.oehm6.Ticket_Booking.Dao.BookingDao;
import com.oehm6.Ticket_Booking.Entity.BusDetails;
import com.oehm6.Ticket_Booking.Entity.TicketDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	Scanner t= new Scanner(System.in);
    	BookingDao dao = new BookingDao();
    	
    	int r=0;
    	do
    	{
    	System.out.println("Enter 1-addbus,Enter 2-getBusDetails,Enter 3-bookTicket,4-confirmTicket,5-cancelTicket");
    	int msg=t.nextInt();
    	
    	if(msg==1)
    	{
    	System.out.println("enter name,timings,from,destination,fare)");
    	int r1=0;
    	
    	do
    	{
    	BusDetails details = new BusDetails();
    	details.setName(t.next());
    	details.setTimings(t.next());
    	details.setFrom(t.next());
    	details.setDestination(t.next());
    	details.setFare(t.nextInt());
    	System.out.println("enter 1 to enter more date other to exit");
    	r1=t.nextInt();
    	dao.saveBusDetails(details);
    	System.out.println("bus Detils added successfully");
    	}
    	while(r1==1);
    	}
    	
    	if(msg==2)
    	{
    		System.out.println("enter the staring, destination");
    		List<BusDetails> busDetails=dao.getBusDetails(t.next(),t.next());
    		busDetails.forEach(each->{
    			System.out.println(each);
    		});
    	}
    	
    	if(msg==3)
    		
    	{
    		int r2=0;
    		do
    		{
    		System.out.println("enter start,destiantion,fare,noOfpasngers");
    		TicketDetails ticket = new TicketDetails();
    		ticket.setStart(t.next());
    		ticket.setDestination(t.next());
    		ticket.setTravelDate(new Date());
    		ticket.setFare(t.next());
    		ticket.setNoOfPassangers(t.nextInt());
    		ticket.setStatus("pending");
    		System.out.println("enter 1 to to book one more ticket");
    		r2=t.nextInt();
    		dao.bookTicket(ticket);
    		System.out.println("ticket booked");
    		}
    		while(r2==1);
    	}
    	
    	if(msg==4)
    	{
    		System.out.println("Eneter id");
    		dao.confirmTicket(t.nextInt());
    		System.out.println("** Ticket Confirmed Thank you**");
    	}
    	
    	if(msg==5)
    	{
    		System.out.println("Enter id");
    		dao.cancelTicket(t.nextInt());
    		System.out.println("**Ticket CANCELED**");
    	}
    	System.out.println("Enter 1 to go to starting");
    	r=t.nextInt();
    	}
    	while(r==1);
    	System.out.println("Exited");
}
}