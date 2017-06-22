package com.entity;

import java.util.ArrayList;
import java.util.Collection;
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
	
	@OneToMany
	@JoinTable(name="PERSONEL_MESLEK", joinColumns = @JoinColumn(name="PERSONEL_ID"), 
	inverseJoinColumns=@JoinColumn(name="MESLEK_ID")
	)
	private Collection<Meslek> meslek = new ArrayList<Meslek>();

	public Collection<Meslek> getMeslek() {
		return meslek;
	}

	public void setMeslek(Collection<Meslek> meslek) {
		this.meslek = meslek;
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