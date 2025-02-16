package it.epicode.BE_W5_Exam.prenotazione;

import it.epicode.BE_W5_Exam.postazione.Postazione;
import it.epicode.BE_W5_Exam.utente.Utente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazione {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	private Utente utente;

	@ManyToOne(fetch = FetchType.EAGER)
	private Postazione postazione;

	private LocalDate dataPrenotazione;

}
