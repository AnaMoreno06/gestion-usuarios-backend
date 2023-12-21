package co.com.gestion.usuarios.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.gestion.usuarios.entity.Usuario;
import co.com.gestion.usuarios.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioController {

	UsuarioRepository usuarioRepository;

	@PostMapping("/save")
	public Usuario saveUsuario(Usuario usuario) {

		return usuarioRepository.save(usuario);

	}

	@PostMapping("/login")
	public Usuario login(Usuario usuario) {

		Optional<Usuario> usuarioCurrent = usuarioRepository.findByEmail(usuario.getEmail());
		if (usuarioCurrent.isPresent() && usuarioCurrent.get().getPassword().equals(usuario.getPassword())) {
			usuarioCurrent.get().setPassword(null);
			return usuarioCurrent.get();

		}
		return null;
	}

}
