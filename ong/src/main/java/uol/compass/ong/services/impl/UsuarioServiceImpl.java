package uol.compass.ong.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import uol.compass.ong.entities.Usuario;
import uol.compass.ong.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UserDetailsService {

//	@Autowired
//	private PasswordEncoder encoder;
	
	@Autowired
	private UsuarioRepository repository;
	
	@Transactional
    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("Email não encontrado na base de dados."));

        String[] roles = usuario.isAdmin() ?
                new String[]{"ADMIN", "USER"} : new String[]{"USER"};

        return User
                .builder()
                .username(usuario.getEmail())
                .password(usuario.getSenha())
                .roles(roles)
                .build();
	}

}
