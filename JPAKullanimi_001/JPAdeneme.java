package com.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAdeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf;
		EntityManager em;
		Personel personel = new Personel();
		personel.setPersonelAdi("hanife");
		emf = Persistence.createEntityManagerFactory("002_SelamJPA");
		em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(personel);
		et.commit();
		
		System.out.println("ID: " + personel.getPersonelid() + "\n ADI" + personel.getPersonelAdi());
		em.close();
		emf.close();
	}
}
