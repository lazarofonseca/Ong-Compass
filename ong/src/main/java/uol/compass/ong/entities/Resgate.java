package uol.compass.ong.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uol.compass.ong.entities.dto.ResgateDTO;
import uol.compass.ong.enums.Status;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Resgate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_Resgate;
	
	private String endereco;
	private String caracteristicas_animal;
	private String descricao;
	private String usuario;
	
	@Enumerated(EnumType.STRING)
	private Status status;

	public Resgate(ResgateDTO resgateDTO) {
		this.endereco = resgateDTO.getEndereco();
		this.caracteristicas_animal = resgateDTO.getCaracteristicas_animal();
		this.descricao = resgateDTO.getDescricao();
		this.usuario = resgateDTO.getUsuario();
		this.status = resgateDTO.getStatus();
	}
}
