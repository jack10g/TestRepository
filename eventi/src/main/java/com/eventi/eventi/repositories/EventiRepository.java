package com.eventi.eventi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eventi.eventi.model.Evento;

@Repository
public interface EventiRepository extends JpaRepository<Evento, Long>{
	
	@Query(nativeQuery = true, value="SELECT * FROM `eventi` WHERE eventi.nome_evento=?1")
	List<Evento> selectAll(String nomeEvento);

	
	@Query(nativeQuery = true, value="SELECT * FROM `eventi` WHERE eventi.durata_evento>?1")
	List<Evento> listaPerDurata(int nDays);
	
	@Query(nativeQuery = true, value="SELECT eventi.* , SUM(partecipanti.quota_versata) AS pagato FROM `eventi` INNER JOIN `partecipanti` ON eventi.id_evento=partecipanti.id_evento GROUP BY partecipanti.id_evento HAVING eventi.costo_evento>pagato")
	List<Evento> listaEventiNonCoperti();
	
}
