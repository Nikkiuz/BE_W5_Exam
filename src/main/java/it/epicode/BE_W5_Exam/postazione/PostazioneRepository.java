package it.epicode.BE_W5_Exam.postazione;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
	List<Postazione> findByTipoAndEdificio_Citta(String tipo, String citta);
}
