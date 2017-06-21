package com.hibernatetest;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Adres;
import com.entity.Personel;

public class HibernateDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personel personel = new Personel();
		personel.setPersonelAdi("Hanife");
		personel.setPersonelSoyadi("Kurnaz");
		personel.setKayitTarihi(new Date());
		Adres adres=new Adres();
		adres.setSehir("Samsun");
		adres.setSemt("Tekkekoy");
		adres.setMahalle("23 Nisan Mahallesi");
		adres.setCadde("Bayir Caddesi");
		adres.setDaireNo("5");
		adres.setKapiNo("55");
		adres.setKat("5");
		adres.setPostaKodu("55555");
		personel.setAdres(adres);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //tanimlanan oturumlari ureten fabrika sinifi
		Session session = sessionFactory.openSession(); //oturumu ac
		session.beginTransaction(); //transaction baslangic
		session.save(personel); //veritabanina kaydet
		session.getTransaction().commit();	//transaction bitis
		session.close(); // oturum nesnesi sonlandirma
		
		personel = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		personel = (Personel)session.get(Personel.class, 1);
		System.out.println("ID : " + personel.getPersonelid());
		System.out.println("Adi Soyadi : " + personel.getPersonelAdi() + " " + personel.getPersonelSoyadi());
		System.out.println("Kayit Tarihi : " + personel.getKayitTarihi());
		System.out.println("Sehir : " + personel.getAdres().getSehir());
		System.out.println("Semt : " + personel.getAdres().getSemt());
		System.out.println("Cadde : " + personel.getAdres().getCadde());
		System.out.println("Mahallesi : " + personel.getAdres().getMahalle());
		System.out.println("Kapi No : " + personel.getAdres().getKapiNo());
		System.out.println("Daire No : " + personel.getAdres().getDaireNo());
	}
}
