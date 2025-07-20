package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	public SessionFactory factory = getSessionFactory();

	public SessionFactory getSessionFactory() {
		return new Configuration().configure().buildSessionFactory();
	}

	public Session getSession() {
		return factory.openSession();
	}

}
