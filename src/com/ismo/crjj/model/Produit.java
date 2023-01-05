package com.ismo.crjj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name="q1",query="from Produit"),
	@NamedQuery(name="q2",query="from Produit where pachat>20 and libelle like 'A%'"),
	@NamedQuery(name="q3",query="from Produit where pvente between 20 and 30"),
	@NamedQuery(name="q4",query="select famille, sum(pachat), sum(pvente)from Produit group by famille"),
	@NamedQuery(name="q5",query="from Produit where famille = :fam"),
	@NamedQuery(name="q7",query="update Produit set pachat = pachat*1.1, pvente = pvente*1.1 where famille = :fam"),
	@NamedQuery(name="q8",query="delete from Produit where libelle like 'A%'"),
})
public class Produit {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int code;
	
	@Column
	private String libelle;
	
	@Column
	private String famille;
	
	@Column(name="prix_achat")
	private double pachat;
	
	@Column(name="prix_vente")
	private double pvente;
	
	
	
	
	@Override
	public String toString() {
		return "Produit [code=" + code + ", libelle=" + libelle + ", famille=" + famille + ", pachat=" + pachat
				+ ", pvente=" + pvente + "]";
	}

	public Produit(int code, String libelle, String famille, double pachat, double pvente) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.famille = famille;
		this.pachat = pachat;
		this.pvente = pvente;
	}

	public Produit() {
		
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getFamille() {
		return famille;
	}
	public void setFamille(String famille) {
		this.famille = famille;
	}
	public double getPachat() {
		return pachat;
	}
	public void setPachat(double pachat) {
		this.pachat = pachat;
	}
	public double getPvente() {
		return pvente;
	}
	public void setPvente(double pvente) {
		this.pvente = pvente;
	}
	
	

}
