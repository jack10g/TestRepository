package com.eventi.eventi.services;

import java.util.List;

import com.eventi.eventi.model.Partecipante;

public interface PartecipanteService {

	public void addPartecipante(Partecipante partecipante1);
	
	public void removePartecipante(Partecipante partecipante1);
	
	public List<Partecipante> selectAll();
	
	public List<Partecipante> searchByName(String name);
	
	public List<Partecipante> searchPartecipanteForEventoName(String name);
	
	public List<Partecipante> searchPartecipantePayment(String paymentWay);
	
	public List<Partecipante> checkCompletePayments(String nomeEvento);
}
