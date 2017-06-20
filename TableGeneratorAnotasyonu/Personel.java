package com.entity;

import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the personel database table.
 * 
 */
@Entity
@Table(name="CALISANLAR")
public class Personel{

	@Id
	@TableGenerator(name="ektablo" , table="tblpersonel", pkColumnName="maasi", pkColumnValue="6000" ,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE,generator="ektablo")
	private int personelid;
	private String personelAdi;
	private String personelSoyadi;
	private Date kayitTarihi;
	private String personelAdresi;

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