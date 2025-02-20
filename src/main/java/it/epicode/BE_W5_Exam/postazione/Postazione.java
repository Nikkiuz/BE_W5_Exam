package it.epicode.BE_W5_Exam.postazione;

import it.epicode.BE_W5_Exam.edificio.Edificio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "postazioni")
public class Postazione {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String descrizione;

	@Enumerated(EnumType.STRING)
	private PostazioneEnum tipo;

	private int maxOccupanti;
	@ManyToOne
	private Edificio edificio;
}
