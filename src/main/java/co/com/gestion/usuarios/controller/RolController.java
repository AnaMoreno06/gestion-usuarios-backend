package co.com.gestion.usuarios.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.gestion.usuarios.entity.OpcionMenu;
import co.com.gestion.usuarios.entity.Rol;
import co.com.gestion.usuarios.entity.RolOpcionMenu;
import co.com.gestion.usuarios.repository.RolOpcionMenuRepository;
import co.com.gestion.usuarios.repository.RolRepository;

@RestController
@RequestMapping("/rol")
@CrossOrigin
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
	
	@GetMapping("/opcionMenu/lista")
	public List<RolOpcionMenu> listaRolesMenu() {
		return rolOpcionMenuRepository.findAll();
	}
	
	@GetMapping("/{id}/opcionMenu/lista")
	public List<RolOpcionMenu> findByIdlistaRolesMenu(@PathVariable Integer id) {
		Optional<Rol>rol=rolRepository.findById(id);
		if(rol.isPresent()) {
			return rolOpcionMenuRepository.findByRol(rol.get());
		}
		return null;
		
	}
	
	@PostMapping("/rol/menu/save")
	public RolOpcionMenu saveRolOpcionMenu(RolOpcionMenu rolOpcionMenu) {
		return rolOpcionMenuRepository.save(rolOpcionMenu);
		
	}
	

}
