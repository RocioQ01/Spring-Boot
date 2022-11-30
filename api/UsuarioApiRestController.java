package cl.generation.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generation.web.models.Usuario;
import cl.generation.web.services.UsuarioServiceImpl;


@RestController
public class UsuarioApiRestController {
	@Autowired //Para inyectar informacion del implement
	private UsuarioServiceImpl usuarioServiceImpl;
	
	@RequestMapping("/guardar/usuario") //Inserta datos y guarda datos
	public Usuario guardarUsuario(@RequestBody Usuario usuario) { //Capturar datos de un usuario desde el cuerpo de una peticion
		/*
		 * {
		 * nombre:"Mijail",
		 * correo:"a@a.cl",
		 * password: "secret"
		 * }
		 * */
		return usuarioServiceImpl.guardarUsuario(usuario);//"Usuario guardado";
		
	}
	
	@RequestMapping("/eliminar/usuario") //Ruta
	public String eliminarUsuario(@RequestBody Long id) {
		//Llamando al metodo eliminar en el service
		String respuesta = usuarioServiceImpl.eliminarUsuario(id);
		return respuesta;
		
	}
	@RequestMapping("/actualizar/usuario")
	public String actualizarUsuario(@RequestBody Usuario usuario) {
		//Validacion logica
		if(usuario.getId()!=null) {
			String mensaje = usuarioServiceImpl.actualizarUsuario(usuario);
			return mensaje;
		}
		return null;
	}
	
	@RequestMapping("/obtener/usuario")
	public Usuario obtenerUsuario(@RequestParam(value="id",required = true) Long id) {
		
		return usuarioServiceImpl.obetenerUsuario(id);
		
	}
	//Listar todos los usuarios
	@GetMapping("/listar/usuario")
	public List<Usuario> obtenerListaUsuarios(){
	return usuarioServiceImpl.obtenerListaUsuarios();
	}
}
	

