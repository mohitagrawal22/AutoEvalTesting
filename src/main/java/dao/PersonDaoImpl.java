package dao;

import entities.Person;
import exceptions.PersonException;
import jakarta.persistence.EntityManager;
import utilities.EMUtil;

public class PersonDaoImpl implements PersonDao {
	

	@Override
	public Person addPerson(Person pObj) throws PersonException {
		// TODO Auto-generated method stub
		
        EntityManager em = EMUtil.provideEntityManager();
        
        if(pObj == null) throw new PersonException();
        
        em.getTransaction().begin();
        pObj = em.merge(pObj);
        em.getTransaction().commit();
        
        return pObj;
	}
	

	@Override
	public Person findPersonById(int id) throws PersonException {
		// TODO Auto-generated method stub
		
        EntityManager em = EMUtil.provideEntityManager();
        
        Person pObj = em.find(Person.class,id);
        
        if(pObj == null) throw new PersonException();
        
        return pObj;
		

	}

	
	@Override
	public Person deletePerson(int id) throws PersonException {
		// TODO Auto-generated method stub
        
        EntityManager em = EMUtil.provideEntityManager();
        
        Person pObj = em.find(Person.class,id);
        
        //boolean boolObj = false;
        
        if(pObj == null) throw new PersonException();
        
        em.getTransaction().begin();
        em.remove(pObj);
        em.getTransaction().commit();
        
        return pObj;
	}

}
