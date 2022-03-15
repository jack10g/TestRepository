package com.eventi.eventi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventi.eventi.model.Partecipante;
import com.eventi.eventi.repositories.PartecipantiRepository;

@Service
public class PartecipanteServiceImpl implements PartecipanteService{

	@Autowired
	PartecipantiRepository gestionePartecipante;

	@Override
	public void addPartecipante(Partecipante partecipante1) {
		gestionePartecipante.save(partecipante1);
	}

	@Override
	public void removePartecipante(Partecipante partecipante1) {
		gestionePartecipante.delete(partecipante1);		
	}

	@Override
	public List<Partecipante> selectAll() {
		return gestionePartecipante.findAll();
	}

	@Override
	public List<Partecipante> searchByName(String name) {
		return gestionePartecipante.searchByName(name);
	}

	@Override
	public List<Partecipante> searchPartecipanteForEventoName(String name) {
		return gestionePartecipante.searchPartecipanteforEventoNome(name);
	}

	@Override
	public List<Partecipante> searchPartecipantePayment(String paymentWay) {
		return gestionePartecipante.searchePartecipantePayment(paymentWay);
	}

	@Override
	public List<Partecipante> checkCompletePayments(String nomeEvento) {
		return gestionePartecipante.checkCompletePayments(nomeEvento);
	}
	
//	public List<String> queryTest(String nome){
//		return gestionePartecipante.queryProva(nome);
//	}
	
	
	
	
	
}
