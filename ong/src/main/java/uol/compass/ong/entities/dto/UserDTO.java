package uol.compass.ong.entities.dto;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	@NotEmpty (message = "O campo email não pode ser vazio")
	private String email;
	
	@NotEmpty (message = "O campo senha não pode ser vazio")
	private String senha;
	
	private boolean admin;
	
	public UserDTO(UserDTO userObj) {
		this.email = userObj.getEmail();
		this.senha = userObj.getSenha();
	}
}
