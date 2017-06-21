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
		personel.setPersonelAdi("Ayse");
		personel.setPersonelSoyadi("Kaplan");
		personel.setKayitTarihi(new Date());
		
		Adres adres=new Adres();
		adres.setSehir("Samsun");
		adres.setSemt("Merkez");
		adres.setMahalle("Kazim Karabekir");
		adres.setCadde("Lise Caddesi");
		adres.setDaireNo("4");
		adres.setKapiNo("44");
		adres.setKat("4");
		adres.setPostaKodu("44444");
		personel.getAdresListesi().add(adres);//adres nesnesindeki verileri listeye ekle
		
		Adres adres2=new Adres();
		adres.setSehir("Antalya");
		adres.setSemt("Sahil");
		adres.setMahalle("Tatil");
		adres.setCadde("Cumhuriyet Caddesi");
		adres.setDaireNo("1");
		adres.setKapiNo("11");
		adres.setKat("1");
		adres.setPostaKodu("11111");
		personel.getAdresListesi().add(adres2);
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); //tanimlanan oturumlari ureten fabrika sinifi
		Session session = sessionFactory.openSession(); //oturumu ac
		session.beginTransaction(); //transaction baslangic
		session.save(personel); //veritabanina kaydet
		session.getTransaction().commit();	//transaction bitis
		session.close(); // oturum nesnesi sonlandirma
	}
}
