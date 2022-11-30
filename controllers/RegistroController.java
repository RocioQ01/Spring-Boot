package cl.generation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.generation.web.models.Usuario;

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
	// captura los parametros @RequestParam
	public String guardarFormulario(@RequestParam("nombre")String nombre,
		@RequestParam("apellido") String apellido,
		@RequestParam("correo") String correo,
		@RequestParam("pass") String pass,
		@RequestParam("nick")String nick,
		@RequestParam("pass2")String pass2){
		System.out.println(nombre+" "+apellido+" "+correo+" "+pass+" "+pass2+""+nick);
		//Instanciar un objeto usuario
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setNick(nick);
		usuario.setCorreo(correo);
		usuario.setPassword(pass);
		usuario.setPassword2(pass2);
		// enviar a base datos
		usuarioServiceImpl.guardarUsuario(usuario);
		
		return "index.jsp"; //Enviar a una vista
	}
	
}
