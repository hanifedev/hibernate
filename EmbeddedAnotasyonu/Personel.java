package com.entity;

import java.util.Date;

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
	private Date kayitTarihi;
	@Embedded
	private Adres adres;

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public String getPersonelSoyadi() {
		return personelSoyadi;
	}

	public void setPersonelSoyadi(String personelSoyadi) {
		this.personelSoyadi = personelSoyadi;
	}

	public Date getKayitTarihi() {
		return kayitTarihi;
	}

	public void setKayitTarihi(Date kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
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