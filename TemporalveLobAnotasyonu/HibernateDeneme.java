package com.hibernatetest;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personel personel = new Personel();
		personel.setPersonelid(5);
		personel.setPersonelAdi("Hanife");
		personel.setPersonelSoyadi("Kurnaz");
		personel.setKayitTarihi(new Date());
		personel.setPersonelAdresi("Samsun Turkiye");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //tanimlanan oturumlari ureten fabrika sinifi
		Session session = sessionFactory.openSession(); //oturumu ac
		session.beginTransaction(); //transaction baslangic
		session.save(personel); //veritabanina kaydet
		session.getTransaction().commit();	//transaction bitis
		session.close(); // oturum nesnesi sonlandirma
		
		personel = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		personel = (Personel) session.get(Personel.class, 5);
		System.out.println("ID Degeri : " + personel.getPersonelid());
		System.out.println("Adi Soyadi : " + personel.getPersonelAdi() + " " 
		+ personel.getPersonelSoyadi());
		System.out.println("Kayit Tarihi : " + personel.getKayitTarihi());
		System.out.println("Adresi : " + personel.getPersonelAdresi());
		}
}
