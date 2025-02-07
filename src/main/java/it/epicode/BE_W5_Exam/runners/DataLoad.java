package it.epicode.BE_W5_Exam.runners;

import it.epicode.BE_W5_Exam.edificio.Edificio;
import it.epicode.BE_W5_Exam.edificio.EdificioRepository;
import it.epicode.BE_W5_Exam.postazione.Postazione;
import it.epicode.BE_W5_Exam.postazione.PostazioneEnum;
import it.epicode.BE_W5_Exam.postazione.PostazioneRepository;
import it.epicode.BE_W5_Exam.utente.Utente;
import it.epicode.BE_W5_Exam.utente.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
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
	@Order(1)
	public void run(String... args) throws Exception {

		Edificio e1 = new Edificio(null,"Edificio 1", "Via Roma 1", "Roma");
		edificioRepository.save(e1);
		Edificio e2 = new Edificio(null,"Edificio 2", "Via Milano 1", "Milano");
		edificioRepository.save(e2);
		Edificio e3 = new Edificio(null,"Edificio 3", "Via Napoli 1", "Milano");
		edificioRepository.save(e3);
		Edificio e4 = new Edificio(null,"Edificio 4", "Via Torino 1", "Roma");
		edificioRepository.save(e4);

		Postazione p1 = new Postazione(null, "Postazione 1", PostazioneEnum.PRIVATO, 10, e1);
		postazioneRepository.save(p1);
		Postazione p2 = new Postazione(null, "Postazione 2", PostazioneEnum.OPENSPACE, 50, e2);
		postazioneRepository.save(p2);
		Postazione p3 = new Postazione(null, "Postazione 3", PostazioneEnum.SALA_RIUNIONI, 20, e3);
		postazioneRepository.save(p3);
		Postazione p4 = new Postazione(null, "Postazione 4", PostazioneEnum.PRIVATO, 5, e4);
		postazioneRepository.save(p4);

		Utente u1 = new Utente(null,"Nkkz", "Niccolò Albanese", "utente1@utente1.it");
		utenteRepository.save(u1);
		Utente u2 = new Utente(null,"pippo69", "Pippo Franco", "utente2@utente2.it");
		utenteRepository.save(u2);
		Utente u3 = new Utente(null,"MagaMagalli", "Giancarlo Magalli", "utente3@utente3.it");
		utenteRepository.save(u3);
		Utente u4 = new Utente(null,"OrecchietteConLeCimDeRep", "Lino Banfi", "utente4@utente4.it");
		utenteRepository.save(u4);


	}

}
