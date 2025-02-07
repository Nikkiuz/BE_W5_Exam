package it.epicode.BE_W5_Exam.runners;

import it.epicode.BE_W5_Exam.prenotazione.Prenotazione;
import it.epicode.BE_W5_Exam.service.PrenotazioniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Order(2)
@Component
public class GestionePrenotazioniRunner implements CommandLineRunner {

	@Autowired
	private PrenotazioniService prenotazioniService;

	@Override
	public void run(String... args) throws Exception {
		Long utenteId = 1L;
		Long postazioneId = 1L;
		LocalDate dataPrenotazione = LocalDate.now().plusDays(1);

		try {
			Prenotazione prenotazione = prenotazioniService.prenotaPostazione(utenteId, postazioneId, dataPrenotazione);
			System.out.println("Prenotazione effettuata con successo: " + prenotazione);
		} catch (RuntimeException e) {
			System.out.println("Errore durante la prenotazione: " + e.getMessage());
		}
	}
}
