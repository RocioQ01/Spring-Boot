package cl.generation.web.services;

import java.util.List;

import cl.generation.web.models.Usuario;

public interface UsuarioService {
	//Definir metodos para el crud usuario
	public Usuario guardarUsuario(Usuario usuario); //Interfaz
	//publico de tipo "String"
	public String eliminarUsuario(Long id);

	public String actualizarUsuario(Usuario usuario);
	
	public Usuario obetenerUsuario(Long id);
	
	public List<Usuario> obtenerListaUsuarios();

		
}

