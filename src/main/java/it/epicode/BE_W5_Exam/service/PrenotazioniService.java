package it.epicode.BE_W5_Exam.service;

import it.epicode.BE_W5_Exam.postazione.Postazione;
import it.epicode.BE_W5_Exam.postazione.PostazioneRepository;
import it.epicode.BE_W5_Exam.prenotazione.Prenotazione;
import it.epicode.BE_W5_Exam.prenotazione.PrenotazioneRepository;
import it.epicode.BE_W5_Exam.utente.Utente;
import it.epicode.BE_W5_Exam.utente.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioniService {
	@Autowired
	private PrenotazioneRepository prenotazioneRepository;
	@Autowired
	private  PostazioneRepository postazioneRepository;
	@Autowired
	private  UtenteRepository utenteRepository;

	public boolean isPostazioneLibera(Long postazioneId, LocalDate dataPrenotazione) {
		Postazione postazione = postazioneRepository.findById(postazioneId).orElseThrow();
		List<Prenotazione> prenotazioni = prenotazioneRepository.findByPostazioneAndDataPrenotazione(postazione, dataPrenotazione);
		return prenotazioni.isEmpty();
	}

	public Prenotazione prenotaPostazione(Long utenteId, Long postazioneId, LocalDate dataPrenotazione) {
		if(isPostazioneLibera(postazioneId, dataPrenotazione)) {
			Utente utente = utenteRepository.findById(utenteId).orElseThrow();
			Postazione postazione = postazioneRepository.findById(postazioneId).orElseThrow();
			Prenotazione prenotazione = new Prenotazione();
			prenotazione.setUtente(utente);
			prenotazione.setPostazione(postazione);
			prenotazione.setDataPrenotazione(dataPrenotazione);
			return prenotazioneRepository.save(prenotazione);
		} else {
			throw new RuntimeException("Postazione non disponibile per la data inserita");
		}
	}
}
