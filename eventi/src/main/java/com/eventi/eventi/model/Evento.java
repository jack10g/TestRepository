package com.eventi.eventi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "eventi")
public class Evento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_evento")
	private Long idEvento;
	private String nomeEvento;
	private String luogoEvento;
	private double quotaIscrizione;
	private double costoEvento;
	private int capienzaMassima;
	private int durataEvento;
	
	
	public Evento(Long idEvento, String nomeEvento, String luogoEvento, double quotaIscrizione, double costoEvento,
			int capienzaMassima, int durataEvento) {
		this.idEvento = idEvento;
		this.nomeEvento = nomeEvento;
		this.luogoEvento = luogoEvento;
		this.quotaIscrizione = quotaIscrizione;
		this.costoEvento = costoEvento;
		this.capienzaMassima = capienzaMassima;
		this.durataEvento = durataEvento;
	}
	
	public Evento() {
		
	}

	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getLuogoEvento() {
		return luogoEvento;
	}

	public void setLuogoEvento(String luogoEvento) {
		this.luogoEvento = luogoEvento;
	}

	public double getQuotaIscrizione() {
		return quotaIscrizione;
	}

	public void setQuotaIscrizione(double quotaIscrizione) {
		this.quotaIscrizione = quotaIscrizione;
	}

	public double getCostoEvento() {
		return costoEvento;
	}

	public void setCostoEvento(double costoEvento) {
		this.costoEvento = costoEvento;
	}

	public int getCapienzaMassima() {
		return capienzaMassima;
	}

	public void setCapienzaMassima(int capienzaMassima) {
		this.capienzaMassima = capienzaMassima;
	}

	public int getDurataEvento() {
		return durataEvento;
	}

	public void setDurataEvento(int durataEvento) {
		this.durataEvento = durataEvento;
	}	
	
	
}
