package it.epicode.BE_W5_Exam.postazione;

import org.springframework.context.annotation.Bean;

public class PostazioneConfig {
	@Bean
	public Postazione postazione() {
		return new Postazione();
	}
}
