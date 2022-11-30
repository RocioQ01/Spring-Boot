package cl.generation.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.Pais;
import cl.generation.web.repositories.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService{

	@Autowired //Inyeccion de dependencias
	private PaisRepository paisRepository; //"private" sSirve para que solo se puede acceder desde el package
										   //"public" puede acceder desde cualquier parte
	@Override
	public Pais guardarPais(Pais pais) { //Guarda los datos de "Pais" y (return) para retornar los guardado
		return paisRepository.save(pais);
	}
}
