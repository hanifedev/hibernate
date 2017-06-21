package com.hibernatetest;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.entity.Meslek;
import com.entity.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personel personel = new Personel();
		personel.setPersonelAdi("Ayse");
		personel.setPersonelSoyadi("Kaplan");
		personel.setKayitTarihi(new Date());
		
		Meslek meslek = new Meslek();
		meslek.setMeslekAdi("bilgisayar muhendisi");
		personel.setMeslek(meslek);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //tanimlanan oturumlari ureten fabrika sinifi
		Session session = sessionFactory.openSession(); //oturumu ac
		session.beginTransaction(); //transaction baslangic
		session.save(personel); //veritabanina kaydet
		session.save(meslek);
		session.getTransaction().commit();	//transaction bitis
		session.close(); // oturum nesnesi sonlandirma
	}
}
