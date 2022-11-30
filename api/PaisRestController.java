package cl.generation.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.Pais;
import cl.generation.web.services.PaisServiceImpl;

@RestController
@RequestMapping("/pais")//Sirve para las rutas
public class PaisRestController {
	
	@Autowired
	private PaisServiceImpl paisserviceimpl;
	
	@RequestMapping("/pais/guardar")
	public Pais pais(@RequestBody Pais pais){ //Postman
		return paisserviceimpl.guardarPais(pais);
	}
	
}
