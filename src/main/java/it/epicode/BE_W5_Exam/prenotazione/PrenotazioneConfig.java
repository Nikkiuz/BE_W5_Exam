package it.epicode.BE_W5_Exam.prenotazione;

import org.springframework.context.annotation.Bean;

public class PrenotazioneConfig {
	@Bean
	public Prenotazione prenotazione() {
		return new Prenotazione();
	}
}
