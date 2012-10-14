package ee.itcollege.i377.praktikum4.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import ee.itcollege.i377.praktikum4.entities.Guard;

public class GuardDao {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Praktikum1");
	
	public List<Guard> getGuards() {
		EntityManager em = emf.createEntityManager();
		try {
		    TypedQuery<Guard> q = em.createNamedQuery("Guard.findAll", Guard.class);
		    List<Guard> guards = q.getResultList();
		    return guards;
		}
		finally {
		    em.close();
		}
	}

}
