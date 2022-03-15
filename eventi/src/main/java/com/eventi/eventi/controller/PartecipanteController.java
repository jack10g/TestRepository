package com.eventi.eventi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eventi.eventi.model.Partecipante;
import com.eventi.eventi.services.PartecipanteService;

@RestController

public class PartecipanteController {
	
	@Autowired
	PartecipanteService gestione;
	
	//Lista completa partecipanti
	@GetMapping("/listaPartecipanti")
	public List<Partecipante> selectAll(){
		return gestione.selectAll();
	}
	
	//Aggiunta di un partecipante al DB
	@PostMapping("/addPartecipante")
	public void addPartecipante(@RequestBody Partecipante partecipante1) {
		gestione.addPartecipante(partecipante1);
	}
	
	//Ricerca partecipanti per nome
	@GetMapping("/listaPartecipantiPerNome/{nome}")
	public List<Partecipante> listaPerNome(@PathVariable String nome){
		return gestione.searchByName(nome);
	}
	
	//Ricerca partecipanti dato un evento
	@GetMapping("/listaPartecipantiPerEventi/{name}")
	public List<Partecipante> listaPerEvento(@PathVariable String name){
		return gestione.searchPartecipanteForEventoName(name);
	}
	
	//Lista dei partecipanti che hanno scelto un determinato mezzo di pagamento
	@GetMapping("/listaPartecipantiMezzoPagamento/{paymentWay}")
	public List<Partecipante> listaPerMezzoPagamento(@PathVariable String paymentWay){
		return gestione.searchPartecipantePayment(paymentWay);
	}
	
	//Lista dei partecipanti che hanno completato il pagamento della quota d'iscrizione dato il nome dell'evento
	@GetMapping("/checkPayments/{nomeEvento}")
	public List<Partecipante> checkCompletePayments(@PathVariable String nomeEvento){
		return gestione.checkCompletePayments(nomeEvento);
	}
	
//	@GetMapping("/test/{nome}")
//	public List<String> queryTest(@PathVariable String nome){
//		return gestione.queryTest(nome);
//	}
	
	
	
}
