package prt4_jpa_maven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		Produto p1 = new Produto(null, "a", "a");
		Produto p2 = new Produto(null, "b", "b");
		
		//
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		
		em.getTransaction().commit();
		
		
		//
		
		
		em.getTransaction().begin();
		
		Produto p = em.find(Produto.class, 1);
		System.out.println(p);
		//em.remove(p);
		
		p = em.find(Produto.class, 2);
		System.out.println(p);
		//em.remove(p);
		
		em.getTransaction().commit();
		
		
		//
		
		/*
		em.getTransaction().begin();
		
		em.persist(p1);
		em.getTransaction().commit();
		
		System.out.println(em.find(Produto.class, 1));
		*/
		em.close();
		emf.close();
	}
}
