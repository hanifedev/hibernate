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
		personel.getAdresListesi().add(adres);//adres nesnesindeki verileri listeye ekle
		
		Adres adres2=new Adres();
		adres.setSehir("Samsun");
		adres.setSemt("Tekkekoy");
		adres.setMahalle("23 Nisan Mahallesi");
		adres.setCadde("Cumhuriyet Caddesi");
		adres.setDaireNo("3");
		adres.setKapiNo("33");
		adres.setKat("3");
		adres.setPostaKodu("55555");
		personel.getAdresListesi().add(adres2);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //tanimlanan oturumlari ureten fabrika sinifi
		Session session = sessionFactory.openSession(); //oturumu ac
		session.beginTransaction(); //transaction baslangic
		session.save(personel); //veritabanina kaydet
		session.getTransaction().commit();	//transaction bitis
		session.close(); // oturum nesnesi sonlandirma
	}
}
