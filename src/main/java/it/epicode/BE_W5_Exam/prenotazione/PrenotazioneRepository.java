package it.epicode.BE_W5_Exam.prenotazione;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

	List<Prenotazione> findByDataPrenotazioneBetween(LocalDate dataInizio, LocalDate dataFine);
	List<Prenotazione> findByUtente(String utente);

	boolean existsByPostazioneAndDataPrenotazione(String postazione, LocalDate dataPrenotazione);
	boolean existsByUtenteAndDataPrenotazione(String utente, LocalDate dataPrenotazione);
}
