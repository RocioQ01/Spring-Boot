package cl.generation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cl.generation.web.models.Rol;

@Controller // Controladores
public class UsuarioController {

	// hhtps://localhost:8080/
	@RequestMapping("/usuario") // Capturamos las rutas
	public String getUsuario() { // Metodo
		System.out.println("Metodo de obtener usuario");
		return "index.jsp";
	}
	//https://localhost:8080/home
	@RequestMapping("/home") //Creando una nueva ruta
	public String home() {
		System.out.println("En el metodo home");
		return "Home";
	}
	//https://localhost:8080/rocioquezada
	@RequestMapping("/rocio/quezada")
	public String rquezada() {
		System.out.println("En el metodo rocio quezada");
		return "rocio quezada";
	}
	
	
	@RequestMapping("/rol")
	public Rol obtenerRol() {
		Rol rol = new Rol();
		rol.setNombre("Lulu");
		rol.setDescripcion("Fea");
		System.out.println("");
		return rol;
	}
}
