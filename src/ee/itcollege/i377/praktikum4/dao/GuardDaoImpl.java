package ee.itcollege.i377.praktikum4.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ee.itcollege.i377.praktikum4.entities.Guard;

@Repository(GuardDaoImpl.NAME)
public class GuardDaoImpl implements GuardDao{
	public static final String NAME = "guardDbDao";
	
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
	
	public void save(Guard guard) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(guard);
		em.getTransaction().commit();
	}

}
