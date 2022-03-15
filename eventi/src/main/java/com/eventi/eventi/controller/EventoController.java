package com.eventi.eventi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eventi.eventi.model.Evento;
import com.eventi.eventi.services.EventoServiceImpl;
import com.eventi.eventi.services.PartecipanteServiceImpl;

@RestController
public class EventoController {

	@Autowired
	EventoServiceImpl gestione;
	@Autowired
	PartecipanteServiceImpl gestionePartecipante;

	@GetMapping("/listaEventi")
	public List<Evento> listaEventi() {
		return gestione.selectAll();
	}

	@GetMapping("/cercaPerNome/{nome}")
	public List<Evento> cercaPerNome(@PathVariable String nome) {
		return gestione.searchByName(nome);
	}

	@PostMapping("/addEvento")
	public void addEvento(@RequestBody Evento evento1) {
		gestione.addEvento(evento1);
	}

	@GetMapping("/listaPerDurata/{nDays}")
	public List<Evento> listaPerDurata(@PathVariable int nDays) {
		return gestione.searchByDay(nDays);
	}

	@DeleteMapping("/removeEvento/{idEvento}")
	public void removeEvento(@PathVariable Long idEvento) {
		gestione.removeEvento(idEvento);
	}

	@GetMapping("/listaEventiNonCoperti")
	public List<Evento> listaEventiNonCoperti() {
		return gestione.listaEventiNonCoperti();
	}

}
