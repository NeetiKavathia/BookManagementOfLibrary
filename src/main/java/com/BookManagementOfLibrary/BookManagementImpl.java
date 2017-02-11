package com.BookManagementOfLibrary;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import com.BookManagementOfLibrary.User;
@Service("bookBo")
public class BookManagementImpl extends CustomHibernateDaoSupport implements BookManagement {

	public void NewUser(User b) {
		getHibernateTemplate().save(b);
	}

	public void DeleteUser(User b) {
		getHibernateTemplate().delete(b);
	}

	public List<User> ViewUser() {
		List<User> u = getHibernateTemplate().find("from User");
		return u;
	}

	public void UpdateContactOfUser(User b, int n) {
		SessionFactory factory = getHibernateTemplate().getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("update User set contact= :n where id= :id");
		query.setParameter("n", n);
		query.setParameter("id", b.getId());
		query.executeUpdate();
		tx.commit();
		session.close();
		factory.close();

	}

	public User FindByName(String name) {
		List<User> l=null;
		l = getHibernateTemplate().find("from User where name='" + name + "'");
		return l.get(0);
	}

}