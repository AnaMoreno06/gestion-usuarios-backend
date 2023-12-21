package co.com.gestion.usuarios.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tipoDocumento;
	private String numeroDocumento;
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String password;

}
