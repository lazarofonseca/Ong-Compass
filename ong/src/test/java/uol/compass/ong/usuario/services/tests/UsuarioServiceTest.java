package uol.compass.ong.usuario.services.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import uol.compass.ong.repository.UsuarioRepository;
import uol.compass.ong.services.UsuarioService;

@ExtendWith(SpringExtension.class)
public class UsuarioServiceTest {
	
	@InjectMocks
	private UsuarioService usuarioService;
	
	@Mock
	private UsuarioRepository usuarioRepository;
	
	private long idExiste;
	
	@BeforeEach
	void setUp() throws Exception{
		idExiste = 1L;
		
		
	}
	
	@Test
	public void deveriaDeletarComSucessoQuandoIdExistir() {
		
		Assertions.assertDoesNotThrow(() ->{
			usuarioService.delete(idExiste);
		});
		
		Mockito.verify(usuarioRepository).deleteById(idExiste);
		
	}

}
