package com.entity;

import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the personel database table.
 * 
 */
@Entity
@Table(name="Calisan_Personeller")
@SecondaryTable(name="personelDetay")
public class Personel{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personelid;
	private String personelAdi;
	private String personelSoyadi;
	@Column(table="personelDetay")
	private Date kayitTarihi;
	
	@Column(name="Maas", table="personelDetay")
	private String personelMaasi;
	@Column(name="Adres", table="personelDetay")
	private String personelAdresi;
	@Column(table="personelDetay")
	private String personelTelefon;
	
	public String getPersonelMaasi() {
		return personelMaasi;
	}

	public void setPersonelMaasi(String personelMaasi) {
		this.personelMaasi = personelMaasi;
	}

	public String getPersonelTelefon() {
		return personelTelefon;
	}

	public void setPersonelTelefon(String personelTelefon) {
		this.personelTelefon = personelTelefon;
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

	public String getPersonelAdresi() {
		return personelAdresi;
	}

	public void setPersonelAdresi(String personelAdresi) {
		this.personelAdresi = personelAdresi;
	}

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