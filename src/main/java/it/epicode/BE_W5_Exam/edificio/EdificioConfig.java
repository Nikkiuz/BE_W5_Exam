package it.epicode.BE_W5_Exam.edificio;

import org.springframework.context.annotation.Bean;

public class EdificioConfig {
	@Bean
	public Edificio edificio() {
		return new Edificio();
	}
}
