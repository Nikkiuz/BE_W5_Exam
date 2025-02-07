package it.epicode.BE_W5_Exam.utente;

import org.springframework.context.annotation.Bean;

public class UtenteConfig {
	@Bean
	public Utente utente() {
		return new Utente();
	}
}
