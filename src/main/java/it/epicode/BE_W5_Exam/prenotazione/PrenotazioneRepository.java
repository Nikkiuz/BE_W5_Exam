package it.epicode.BE_W5_Exam.prenotazione;

import it.epicode.BE_W5_Exam.postazione.Postazione;
import it.epicode.BE_W5_Exam.utente.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

	List<Prenotazione> findByDataPrenotazioneBetween(LocalDate dataInizio, LocalDate dataFine);
	List<Prenotazione> findByUtente(Utente utente);

	boolean existsByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
	boolean existsByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);

	List<Prenotazione> findByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);
}
