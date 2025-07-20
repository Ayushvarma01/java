package Hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		Session session = new HibernateConfig().getSession();
		Transaction tx = session.beginTransaction();
		Student student = new Student();
		student.setId(5);
		student.setName("Ayush");
		session.save(student);
		tx.commit();
		session.close();

	}
}
