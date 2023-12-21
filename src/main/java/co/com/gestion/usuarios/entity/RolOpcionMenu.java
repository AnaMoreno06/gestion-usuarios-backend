package co.com.gestion.usuarios.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="rol_opcion_menu")
public class RolOpcionMenu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="rol_id")
	private Rol rol;
	@ManyToOne
	@JoinColumn(name="opcion_menu_id")
	private OpcionMenu opcionMenu;
	

}
