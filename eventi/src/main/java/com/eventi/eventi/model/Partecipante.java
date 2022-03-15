package com.eventi.eventi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "partecipanti")
public class Partecipante implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_partecipanti")
	private Long idPartecipante;
	@Column(name="nome")
	private String nome;
	@Column(name="cognome")
	private String cognome;
	@Column(name="affiliazione")
	private String affiliazione;
	@Column(name="mezzo_pagamento")
	private String mezzoPagamento;
	@Column(name="quota_versata")
	private double quotaIscrizioneVersata;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_evento", referencedColumnName = "id_evento")
	private Evento idEvento;

	public Partecipante(Long idPartecipante, String nome, String cognome, String affiliazione, String mezzoPagamento,
			double quotaIscrizioneVersata, Evento idEvento) {
		this.idPartecipante=idPartecipante;
		this.nome = nome;
		this.cognome = cognome;
		this.affiliazione = affiliazione;
		this.mezzoPagamento = mezzoPagamento;
		this.quotaIscrizioneVersata = quotaIscrizioneVersata;
		this.idEvento = idEvento;
	}
	
	public Partecipante() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getAffiliazione() {
		return affiliazione;
	}

	public void setAffiliazione(String affiliazione) {
		this.affiliazione = affiliazione;
	}

	public String getMezzoPagamento() {
		return mezzoPagamento;
	}

	public void setMezzoPagamento(String mezzoPagamento) {
		this.mezzoPagamento = mezzoPagamento;
	}

	public double getQuotaIscrizioneVersata() {
		return quotaIscrizioneVersata;
	}

	public void setQuotaIscrizioneVersata(double quotaIscrizioneVersata) {
		this.quotaIscrizioneVersata = quotaIscrizioneVersata;
	}

	public Evento getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Evento idEvento) {
		this.idEvento = idEvento;
	}

	public Long getIdPartecipante() {
		return idPartecipante;
	}

	public void setIdPartecipante(Long idPartecipante) {
		this.idPartecipante = idPartecipante;
	}
	
	
}
