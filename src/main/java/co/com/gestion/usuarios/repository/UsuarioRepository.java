package co.com.gestion.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.gestion.usuarios.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
