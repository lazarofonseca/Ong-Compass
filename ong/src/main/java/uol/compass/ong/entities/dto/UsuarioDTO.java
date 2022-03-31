package uol.compass.ong.entities.dto;

<<<<<<< HEAD
import uol.compass.ong.entities.Usuario;

public class UsuarioDTO {

	private Long id_usuario;
	private String nome;
	private String cpf;
	private Integer idade;
	private String telefone;
	private String email;
	private String senha;
	
	public UsuarioDTO() {
	}
=======
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uol.compass.ong.entities.Usuario;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioDTO {

	private Long id_usuario;
	
	@NotNull @NotEmpty
	private String nome;
	@NotNull @NotEmpty
	private String cpf;
	@NotNull
	private Integer idade;
	@NotNull @NotEmpty
	private String telefone;
	@NotNull @NotEmpty
	private String email;
	@NotNull @NotEmpty
	private String senha;
	
>>>>>>> e16f7a1b634b998659c7969507ace7e4c852738c

	public UsuarioDTO(Usuario usuarioObj) {
		this.id_usuario = usuarioObj.getId_Usuario();
		this.nome = usuarioObj.getNome();
		this.cpf = usuarioObj.getCpf();
		this.idade = usuarioObj.getIdade();
		this.telefone = usuarioObj.getTelefone();
		this.email = usuarioObj.getEmail();
		this.senha = usuarioObj.getSenha();
	}

<<<<<<< HEAD
	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
=======
>>>>>>> e16f7a1b634b998659c7969507ace7e4c852738c

}
