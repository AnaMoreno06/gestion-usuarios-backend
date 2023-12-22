package co.com.gestion.usuarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.gestion.usuarios.entity.Rol;
import co.com.gestion.usuarios.entity.RolOpcionMenu;

public interface RolOpcionMenuRepository extends JpaRepository<RolOpcionMenu,Integer> {
	
	List<RolOpcionMenu> findByRol(Rol rol);

}
