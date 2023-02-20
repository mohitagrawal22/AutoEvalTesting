package utilities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
	
	
	private static EntityManagerFactory e = null;
	
	
	public static EntityManager provideEntityManager() {
		
		EntityManager em = null;
		
		if(e==null) {
			e=Persistence.createEntityManagerFactory("personUnit");
		}
		
		
		em = e.createEntityManager();
		
		return em;
	}
	

}
