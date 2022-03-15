package com.eventi.eventi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eventi.eventi.model.Partecipante;

@Repository
public interface PartecipantiRepository extends JpaRepository<Partecipante, Long>{
	
	@Query(nativeQuery = true, value="SELECT * FROM `partecipanti` WHERE partecipanti.nome=?1")
	List<Partecipante> searchByName(String nomePartecipante);
	
	@Query(nativeQuery = true, value="SELECT * FROM `partecipanti` INNER JOIN `eventi` ON partecipanti.id_evento=eventi.id_evento AND eventi.nome_evento=?1")
	List<Partecipante> searchPartecipanteforEventoNome(String nomeEvento);
	
	@Query(nativeQuery = true, value="SELECT * FROM `partecipanti` WHERE partecipanti.mezzo_pagamento = ?1")
	List<Partecipante> searchePartecipantePayment(String paymentWay);
	
	@Query(nativeQuery = true, value="SELECT * FROM `partecipanti` INNER JOIN `eventi` ON partecipanti.quota_versata<eventi.quota_iscrizione AND eventi.id_evento=partecipanti.id_evento AND eventi.nome_evento=?1")
	List<Partecipante> checkCompletePayments(String nomeEvento);
	
//	@Query(nativeQuery = true, value="SELECT partecipanti.nome FROM `partecipanti` INNER JOIN `eventi` ON partecipanti.id_evento=eventi.id_evento AND eventi.nome_evento=?1")
//	List<String> queryProva(String nomeEvento);
}
