/*package cl.generation.web.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

// tranformar nuestra clase en una entidad

@Table(name = "usuarios") // el se va a relacionar con nuestra tabla usuario
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario111 { // este objeto luego se transformara en entidad // con estos datos se pueden
						// hacer registro y login
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // en la creacion de la primary key y que se autoincremtable
	private Long id; // Bigint

	@NotNull
	@Size(min = 3, max = 15, message = "Error en el ingreso del nombre") // Tiene un tamaño minimo y maximo, hasta 15 //
																			// caracteres
	private String nombre;

	@NotNull
	private String correo;

	@NotNull
	private String password;

	// Relacion OneToOne
	@JsonIgnore // Trae en este caso usuario porque es FK de auto : Recursividad
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Auto auto;

	// Relacion OneToMany
	@JsonIgnore // Permite eliminar error de recursividad
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Direccion> direcciones;

	// ManyToMany
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "roles_usuarios", // nombre de la tabla relacional simple(agrega dos datos: columnas)
			joinColumns = @JoinColumn(name = "rol_id"), inverseJoinColumns = @JoinColumn(name = "usuario_id"))
	private List<Rol> roles; // Lista de en este caso "Rol"
	// cascade: Elimina la relacion y despues el dato

	@Transient // No se considera la columna en la creacion de la tabla
	private String password2; // para confirmar contraseña

	private String nick;

	@Range(min = 40, max = 300, message = "Peso fuera de rango")
	private Float peso;

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd") // Año - mes - dia
	private Date createdAt; // Insertar un registro

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt; // Modificar un registro


	// Atributos de control
	// Agregar a la columna la fecha antes de insertar
	// Pre persis antes que se guarde le agrega la fecha actual,
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate // Insertar la fecha en la que se ejecuta (Siempre la ultima actualizacion)
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}*/
