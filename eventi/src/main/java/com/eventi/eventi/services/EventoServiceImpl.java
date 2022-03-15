package com.eventi.eventi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventi.eventi.model.Evento;
import com.eventi.eventi.repositories.EventiRepository;
@Service
public class EventoServiceImpl implements EventoService{

	@Autowired
	EventiRepository gestioneEventi;
	@Override
	public void addEvento(Evento evento) {
		gestioneEventi.save(evento);
		
	}

	@Override
	public void removeEvento(Long idEvento) {
		gestioneEventi.deleteById(idEvento);
		
	}

	@Override
	public List<Evento> selectAll() {
		return gestioneEventi.findAll();
	}

	@Override
	public List<Evento> searchByName(String name) {
		return gestioneEventi.selectAll(name);
	}

	@Override
	public List<Evento> searchByDay(int nDay) {
		return gestioneEventi.listaPerDurata(nDay);
	}

	@Override
	public List<Evento> listaEventiNonCoperti() {
		return gestioneEventi.listaEventiNonCoperti();
	}


}
