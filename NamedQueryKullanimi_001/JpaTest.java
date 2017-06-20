package com.jpatest;

import com.deneme.Ogrenci;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf;
		EntityManager em;
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setOgrNum("1663432");
		ogrenci.setOgrAdi("hanife");
		ogrenci.setOgrBolum("bilgisayar mühendisligi");
		ogrenci.setOgrFakulte("muhendislik");
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.setOgrNum("543532");
		ogrenci2.setOgrAdi("ayse");
		ogrenci2.setOgrBolum("bilgisayar mühendisligi");
		ogrenci2.setOgrFakulte("muhendislik");
		emf = Persistence.createEntityManagerFactory("AyarDosyasi");
		em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(ogrenci);
		et.commit();
		
		Query query = em.createNamedQuery("tumOgrenciKayitlariniGetir");
		List<?> list = query.getResultList();
		for(Object obj : list){
			ogrenci = (Ogrenci) obj;
		}
		System.out.println(" ID: " + ogrenci.getOgrId() + "\n Adi:" + ogrenci.getOgrAdi() + 
				"\n Bolum:" + ogrenci.getOgrBolum() + "\n Fakulte:" + ogrenci.getOgrFakulte());
	}

}
