package uol.compass.usuario.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import uol.compass.usuario.controller.dto.AnimalDTO;

@Service
public class UsuarioService {

	@Autowired
	private RestTemplate usuario;

	public List<AnimalDTO> getAnimal(String especie) {

		ResponseEntity<AnimalDTO[]> exchange = usuario.exchange("http://ong/animais/Especie/" + especie, HttpMethod.GET,
				null, AnimalDTO[].class);

		List<AnimalDTO> list = new ArrayList<>();
		Stream.of(exchange.getBody()).forEach(animal -> list.add(animal));

		return list;

	}

}
