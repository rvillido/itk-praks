package ee.itcollege.i377.praktikum4.servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ee.itcollege.i377.praktikum4.entities.Guard;

//@WebServlet("/jpaTestServlet")
public class JpaTestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Praktikum1");

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream out = resp.getOutputStream();
		EntityManager em = emf.createEntityManager();
		try {
		    Guard g = em.find(Guard.class, 1);
		    out.println("Guard " + g.getId() + ": " + g.getName());
		    g.setName("Test");
		    em.getTransaction().begin();
		    em.persist(g);
		    em.getTransaction().commit();
		    g = em.find(Guard.class, 1);
		    out.println("Guard " + g.getId() + ": " + g.getName());
		    
		}
		finally {
		    em.close();
		} 
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getParameter("name");
	}

	@Override
	public void destroy() {
	    emf.close();
	}
}
