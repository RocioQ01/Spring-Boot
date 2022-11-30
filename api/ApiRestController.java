package cl.generation.web.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // responder a
@RequestMapping("/api") //
public class ApiRestController {
	// https://localhost:8080/api/hola
	@RequestMapping("/hola")
	public String hola() {
		return "Hola api";
	}

	// https://localhost:8080/api/edad/20
	@RequestMapping("/edad/{edad}") // Sirve para capturar un valor que ira cambiando en el tiempo
	public String rutaDinamica(@PathVariable("edad") int edad) {
		return "Capturando edad: " + edad;// Concatenanando
	}

	// https://localhost:8080/api/nombre/Jhin
	@RequestMapping("/nombre/{nombre}")
	public String capturarNombre(@PathVariable("nombre") String nombre) {
		return "El nombre es: " + nombre;
	}

	// https://localhost:8080/api/14/noviembre/2022
	@RequestMapping("/{dia}/{mes}/{año}")
	public String capturarNombre(@PathVariable("dia") int dia, @PathVariable("mes") int mes,
			@PathVariable("año") int año) {
		return "Capturando fecha: " + dia + "" + mes + "" + año;
	}

	// http://localhost:8080/api/usuario?usuarioId=1//Peticiones tipo "GET", en la
	// ruta se ven los parametros
	@RequestMapping("/usuario") //Capturar ruta
		public String parametro(@RequestParam(value="usuarioId",required = false) Integer id ) { //Value = valor
			//int,long,float son iguales a "uno" (=0) No pueden ser nulos
			//Integer, Float,Long...pueden ser nulos(null)
			if(id == null) {
				return "Parametro no existe";
			}else {
			return "parametro por get"+id; //Valida
		}
	}

	// http://localhost:8080/api/usuario2?usuarioId=1
	@RequestMapping("/usuario2")
			public String parametro(@RequestParam(value="usuarioId",required = false) Integer id,
					@RequestParam(value="nombre",required = false) String nombre ) {
				if(id == null) {
					return "Parametro no existe";
				}else {
				return "parametro por get"+id+"nombre: "+nombre;
			
				}
			}
	}