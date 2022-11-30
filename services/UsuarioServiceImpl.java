package cl.generation.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generation.web.models.Usuario;
import cl.generation.web.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
//Clase implementacion //Logica de negocio del sistema web
	@Autowired //Inyectar clase
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		// usuarioRepository.save(usuario);//Guarda una entidad en este caso
		// "usuario"//Llama al metodo "Guardar"
		return usuarioRepository.save(usuario);
	}

	@Override
	public String eliminarUsuario(Long id) {
		// eliminno el usuario pasando el id (pk)
		Boolean existe = usuarioRepository.existsById(id);

		if (existe) {

			usuarioRepository.deleteById(id);
		} else {
			return "Usuario no existe en tabla";
		}

		existe = usuarioRepository.existsById(id);
		// validar su fue eliminado o no el registro
		// Optional<Usuario> usuario = usuarioRepository.findById(id);
		// si es distinto de nulo, no fue eliminado
		if (existe) {
			return "Usuario no eliminado";
		}
		return "El usuairo fue eliminado";
	}

	@Override
	public String actualizarUsuario(Usuario usuario) {

		Boolean existe = usuarioRepository.existsById(usuario.getId());

		if (existe) {
			usuarioRepository.save(usuario);
			return "Usuario actualizado";
		}
		return "Usuario no actualizado";
	}

	public Usuario obetenerUsuario(Long id) {
		//Optional<Usuario> user = usuarioRepository.findById(id);
		Boolean existe = usuarioRepository.existsById(id);
		
		if(existe) {
		Usuario user= usuarioRepository.findById(id).get();
		return user;
		}
		return null;
	}
	//Listar todos los usuarios
	@Override
	public List<Usuario> obtenerListaUsuarios(){
	//Obtener todos los usuarios
	return usuarioRepository.findAll();
	}
	
}
