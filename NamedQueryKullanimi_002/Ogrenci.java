package com.jpaentity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ogrenci database table.
 * 
 */
@Entity
@NamedQuery(name = "tumOgrenciKayitlariniGetir", query = "SELECT ogr FROM Ogrenci ogr")

public class Ogrenci implements Serializable {
	private static final long serialVersionUID = 1L;

	
	public Ogrenci(String ogrAdi, String ogrBolum, String ogrFakulte, String ogrNum) {
		super();
		this.ogrAdi = ogrAdi;
		this.ogrBolum = ogrBolum;
		this.ogrFakulte = ogrFakulte;
		this.ogrNum = ogrNum;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ogr_id")
	private int ogrId;

	@Column(name="ogr_adi")
	private String ogrAdi;

	@Column(name="ogr_bolum")
	private String ogrBolum;

	@Column(name="ogr_fakulte")
	private String ogrFakulte;

	@Column(name="ogr_num")
	private String ogrNum;

	public Ogrenci() {
	}

	public int getOgrId() {
		return this.ogrId;
	}

	public void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}

	public String getOgrAdi() {
		return this.ogrAdi;
	}

	public void setOgrAdi(String ogrAdi) {
		this.ogrAdi = ogrAdi;
	}

	public String getOgrBolum() {
		return this.ogrBolum;
	}

	public void setOgrBolum(String ogrBolum) {
		this.ogrBolum = ogrBolum;
	}

	public String getOgrFakulte() {
		return this.ogrFakulte;
	}

	public void setOgrFakulte(String ogrFakulte) {
		this.ogrFakulte = ogrFakulte;
	}

	public String getOgrNum() {
		return this.ogrNum;
	}

	public void setOgrNum(String ogrNum) {
		this.ogrNum = ogrNum;
	}

}
