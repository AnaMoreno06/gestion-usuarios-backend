package co.com.gestion.usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.gestion.usuarios.entity.OpcionMenu;
import co.com.gestion.usuarios.repository.OpcionMenuRepository;

@CrossOrigin
@RequestMapping("/opcion/menu")
public class OpcionMenuController {
	
	@Autowired
	OpcionMenuRepository opcionMenuRepository;
	
	@GetMapping
	public List<OpcionMenu>lista(){
		return opcionMenuRepository.findAll();
	}
	
	@PostMapping("/save")
	public OpcionMenu saveOpcionMenu(OpcionMenu opcionMenu) {
		return opcionMenuRepository.save(opcionMenu);
	}
	
	
	
	
	

}
