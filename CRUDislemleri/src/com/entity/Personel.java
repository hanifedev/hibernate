package com.entity;

import javax.persistence.*;


/**
 * The persistent class for the personel database table.
 * 
 */
@Entity
@Table(name="PersonelTablosu")
public class Personel{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personelid;
	private String personelAdi;
	private String personelSoyadi;

	public String getPersonelSoyadi() {
		return personelSoyadi;
	}

	public void setPersonelSoyadi(String personelSoyadi) {
		this.personelSoyadi = personelSoyadi;
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