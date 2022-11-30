package cl.generation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/registro") // Ruta generica
public class RegistroController {
//http://localhost:8080/registro/usuario
	// Capturar la url y
	@RequestMapping("/usuario")
	public String mostrarFormulario() {
		// desplegar el jsp
		return "regristro.jps";
	}

	// llenamos el formulario(vista)
	/// enviamos el formulario(vista) al controlador
	// captura la url,
	
	@RequestMapping("/formulario")
	public String guardarFormulario(@RequestParam("nombre")String nombre,
		@RequestParam("apellido") String apellido,
		@RequestParam("correo") String correo,
		@RequestParam("pass") String pass){
		System.out.println(nombre+" "+apellido+" "+correo+" "+pass);
		return "index.jsp";
	}
	// captura los parametros
	// enviar a base datos

}
