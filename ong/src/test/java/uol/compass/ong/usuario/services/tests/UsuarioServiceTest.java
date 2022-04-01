package uol.compass.ong.usuario.services.tests;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import uol.compass.ong.repository.UsuarioRepository;
import uol.compass.ong.services.UsuarioService;

@ExtendWith(SpringExtension.class)
public class UsuarioServiceTest {
	
	@InjectMocks
	private UsuarioService usuarioService;
	
	@Mock
	private UsuarioRepository usuarioRepository;
	
	

}
