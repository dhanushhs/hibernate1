package com.oehm6.Ticket_Booking.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.oehm6.Ticket_Booking.Entity.BusDetails;
import com.oehm6.Ticket_Booking.Entity.TicketDetails;

public class BookingDao {

	public void saveBusDetails(BusDetails details)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(details);
		transaction.commit();
	}
	
	public void bookTicket(TicketDetails ticket)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ticket);
		transaction.commit();
	}
	
	public void confirmTicket(int id)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery="update TicketDetails set status='Confirmed' where id=:i";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("i",id);
		query.executeUpdate();
		transaction.commit();
	}
	
	public List<BusDetails> getBusDetails(String start,String destination)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery="from BusDetails"
				+ " where start=:s"
				+ " and destination=:d";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("s",start);
		query.setParameter("d", destination);
		List<BusDetails> list=query.list();
		return list;
	}
	
	public void cancelTicket(int id)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery="delete TicketDetails  where id=:i";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("i",id);
		query.executeUpdate();
		transaction.commit();
		
	}
}
