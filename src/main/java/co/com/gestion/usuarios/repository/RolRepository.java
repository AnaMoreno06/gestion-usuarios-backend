package co.com.gestion.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.gestion.usuarios.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer>{

}
