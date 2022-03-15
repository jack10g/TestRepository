package com.eventi.eventi.services;

import java.util.List;

import com.eventi.eventi.model.Evento;

public interface EventoService {

	public void addEvento(Evento evento);
	
	public void removeEvento(Long idEvento);
	
	public List<Evento> selectAll();
	
	public List<Evento> searchByName(String name);
	
	public List<Evento> searchByDay(int nDay);
	
	public List<Evento> listaEventiNonCoperti();
}
