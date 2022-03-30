package uol.compass.ong.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uol.compass.ong.entities.Usuario;
import uol.compass.ong.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public Usuario findById(Long id) {

		return usuarioRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Id " + id + " não encontrado."));
	}

}
