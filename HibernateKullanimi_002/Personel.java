package com.hibernatetutorial;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personel {
	private int personelid;
	private String personelAdi;
	
	@Id
	public int getPersonelid() {
		return personelid;
	}
	public void setPersonelid(int personelid) {
		this.personelid = personelid;
	}
	public String getPersonelAdi() {
		return personelAdi;
	}
	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}	
}
