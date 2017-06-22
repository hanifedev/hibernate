package com.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="MESLEK")
public class Meslek {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int meslekId;
	private String meslekAdi;
	
	@ManyToMany
	private Collection<Personel> personelListesi = new ArrayList<Personel>();
	
	public Collection<Personel> getPersonelListesi() {
		return personelListesi;
	}
	public void setPersonelListesi(Collection<Personel> personelListesi) {
		this.personelListesi = personelListesi;
	}
	public int getMeslekId() {
		return meslekId;
	}
	public void setMeslekId(int meslekId) {
		this.meslekId = meslekId;
	}
	public String getMeslekAdi() {
		return meslekAdi;
	}
	public void setMeslekAdi(String meslekAdi) {
		this.meslekAdi = meslekAdi;
	}
	
}
