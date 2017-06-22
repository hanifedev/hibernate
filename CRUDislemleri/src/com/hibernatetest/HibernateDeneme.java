package com.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.entity.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		for(int i = 1; i < 6; i++){
			Personel personel = new Personel();
			personel.setPersonelAdi("ADI ");
			personel.setPersonelSoyadi("SOYADI" + i);
			session.save(personel);
		}
		Personel personel = (Personel)session.get(Personel.class, 3);
		System.out.println("Çekilen Veri : " + personel.getPersonelAdi() + personel.getPersonelSoyadi());
		session.delete(personel);
		Personel personel1 = (Personel)session.get(Personel.class,4);
		personel1.setPersonelAdi("Hanife");
		personel1.setPersonelSoyadi("Kurnaz");
		session.update(personel1);
		session.getTransaction().commit();
		session.close();
		System.out.println("Yenilenen veri : " + personel1.getPersonelAdi() + " " + personel1.getPersonelSoyadi());
	}
}
