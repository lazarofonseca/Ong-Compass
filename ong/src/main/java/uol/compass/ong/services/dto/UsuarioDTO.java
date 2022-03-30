package uol.compass.ong.services.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

	private Long id_Usuario;
	private String nome;
	private String cpf;
	private Integer idade;
	private String telefone;
	private String email;
	private String senha;

}

