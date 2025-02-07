package it.epicode.BE_W5_Exam.runners;

import it.epicode.BE_W5_Exam.edificio.Edificio;
import it.epicode.BE_W5_Exam.edificio.EdificioRepository;
import it.epicode.BE_W5_Exam.postazione.PostazioneRepository;
import it.epicode.BE_W5_Exam.utente.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoad implements CommandLineRunner {
	@Autowired
	private final EdificioRepository edificioRepository;
	@Autowired
	private final PostazioneRepository postazioneRepository;
	@Autowired
	private final UtenteRepository utenteRepository;

	public DataLoad(EdificioRepository edificioRepository, PostazioneRepository postazioneRepository, UtenteRepository utenteRepository) {
		this.edificioRepository = edificioRepository;
		this.postazioneRepository = postazioneRepository;
		this.utenteRepository = utenteRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		Edificio e1 = new Edificio(null,"Edificio 1", "Via Roma 1", "Roma");
		edificioRepository.save(e1);
		Edificio e2 = new Edificio(null,"Edificio 2", "Via Milano 1", "Milano");
		edificioRepository.save(e2);



	}

}
