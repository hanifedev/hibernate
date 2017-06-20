package com.entity;

import javax.persistence.*;


/**
 * The persistent class for the personel database table.
 * 
 */
@Entity(name="Personel_tablosu") //veritabanindaki tablo adi
public class Personel{

	@Id
	@Column(name="Personelid") //veritabanindaki kolon adi
	private int personelid;
	@Column(name="personel_adi") //veritabanindaki kolon adi
	private String personelAdi;

	public Personel() {
	}

	public int getPersonelid() {
		return this.personelid;
	}

	public void setPersonelid(int personelid) {
		this.personelid = personelid;
	}

	public String getPersonelAdi() {
		return this.personelAdi;
	}

	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}

}