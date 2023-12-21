package co.com.gestion.usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.gestion.usuarios.entity.Rol;
import co.com.gestion.usuarios.entity.RolOpcionMenu;
import co.com.gestion.usuarios.repository.RolOpcionMenuRepository;
import co.com.gestion.usuarios.repository.RolRepository;

@RestController
@RequestMapping("/rol")
public class RolController {
	@Autowired
	RolRepository rolRepository;

	@Autowired
	RolOpcionMenuRepository rolOpcionMenuRepository;
	

	@PostMapping("/save")
	public Rol saveRol(Rol rol) {

		return rolRepository.save(rol);

	}

	@GetMapping
	public List<Rol> listaRoles() {
		return rolRepository.findAll();
	}
	
	@PostMapping("/rol/menu/save")
	public RolOpcionMenu saveRolOpcionMenu(RolOpcionMenu rolOpcionMenu) {
		return rolOpcionMenuRepository.save(rolOpcionMenu);
		
	}
	

}
