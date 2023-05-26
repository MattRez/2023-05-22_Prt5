package prt4_jpa_maven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto(null, "a", "a");
		Produto p2 = new Produto(null, "b", "b");
		
		Cliente c1 = new Cliente(null, "a", "a", "a", "01/01/2001");
		Cliente c2 = new Cliente(null, "b", "b", "b", "02/02/2002");
		Cliente c3 = new Cliente(null, "c", "c", "c", "03/03/2003");
		
		Funcionario f1 = new Funcionario(null, "a", "a");
		Funcionario f2 = new Funcionario(null, "b", "b");
		
		//
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		
		em.persist(f1);
		em.persist(f2);
		
		em.getTransaction().commit();
		
		//
		
		Produto p = em.find(Produto.class, 1);
		System.out.println(p);
		p = em.find(Produto.class, 2);
		System.out.println(p);
		
		Cliente c = em.find(Cliente.class, 1);
		System.out.println(c);
		c = em.find(Cliente.class, 2);
		System.out.println(c);
		c = em.find(Cliente.class, 3);
		System.out.println(c);
		
		Funcionario f = em.find(Funcionario.class, 1);
		System.out.println(f);
		f = em.find(Funcionario.class, 2);
		System.out.println(f);
		
		//
		
		/*
		em.getTransaction().begin();
		
		Produto remP = em.find(Produto.class, 1);
		em.remove(remP);
		remP = em.find(Produto.class, 2);
		em.remove(remP);
		
		Cliente remC = em.find(Cliente.class, 1);
		em.remove(remC);
		
		remC = em.find(Cliente.class, 2);
		em.remove(remC);
		remC = em.find(Cliente.class, 3);
		em.remove(remC);
		
		Funcionario remF = em.find(Funcionario.class, 1);
		em.remove(remF);
		
		remF = em.find(Funcionario.class, 2);
		em.remove(remF);
		
		em.getTransaction().commit();
		*/
		
		em.close();
		emf.close();
	}
}

/*
Scanner scan = new Scanner(System.in);
int opt = scan.nextInt();

do {
	
} while (opt != 0);
*/

/*
public static void menu() {
	System.out.println("1. Adicionar Entidade?");
	System.out.println("2. Buscar Entidade?");
	System.out.println("3. Remover Tabela.");
}*/