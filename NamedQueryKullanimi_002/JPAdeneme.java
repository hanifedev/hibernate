package com.jpatest;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpaentity.Ogrenci;

public class JPAdeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setOgrAdi("hanife");
		ogrenci.setOgrNum("32342523");
		ogrenci.setOgrBolum("bilgisayar muhendisligi");
		ogrenci.setOgrFakulte("muhendislik");
		
		Ogrenci ogrenci2 = new Ogrenci("ayse","insaat muhendisligi","muhendislik","43342342");
		Ogrenci ogrenci3 = new Ogrenci("fatma","bilgisayar ogretmenligi","egitim","345674567");
		
		EntityManagerFactory emf;
		EntityManager em;
		emf = Persistence.createEntityManagerFactory("AyarDosyasi");
		em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try{
			tx.begin();
			em.persist(ogrenci3);
			kayitEkle(em,"ali","makine muhendisligi","muhendislik","345567");
			em.persist(ogrenci);
			kayitEkle(em,"veli","ingilizce ogretmenligi","egitim","324235");
			kayitEkle(em,"hacer","tarih","fen edebiyat","2356642");
			em.persist(ogrenci2);
			tx.commit();
		}
		catch(RuntimeException e){
			tx.rollback();
			System.out.println("hata" + e);
		}
		finally{
			if(em != null)
			{
				kayitlariYazHepsi(em);
				em.close();
				emf.close();
			}
		}
	}
	private static void kayitEkle(EntityManager em, String ad, String bolum, String fakulte, String num){
		Ogrenci ogrNesne = new Ogrenci(ad,bolum,fakulte,num);
		em.persist(ogrNesne);
	}
	private static void kayitlariYazHepsi(EntityManager em){
		Query query = em.createNamedQuery("tumOgrenciKayitlariniGetir");
		List<?> list = query.getResultList();
		for(Object obj : list){
			Ogrenci ogrenci = (Ogrenci) obj;
			System.out.println("ID: " + ogrenci.getOgrId()+ "\n Adı:" + ogrenci.getOgrAdi() 
			+ "\n Fakulte:" + ogrenci.getOgrFakulte() + "\n Bolum:" + ogrenci.getOgrBolum());
		}
	}
}
