package br.com.sicredi.system.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sicredi.system.model.Usuario;
import br.com.sicredi.system.service.UsuarioService;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	public Usuario newUsuario(@RequestBody Usuario usuario) {
		return usuarioService.newUsuario(usuario);
	}
	
	@GetMapping
	public Iterable<Usuario> getUsuarios() {
		return usuarioService.getUsuarios();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Usuario> getUsuario(@PathVariable String id) {
		return usuarioService.getUsuario(id);
	}
	
	@PutMapping
	public Usuario updateUsuario(@RequestBody Usuario usuario) {
		return usuarioService.updateUsuario(usuario);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteUsuario(String id) {
		usuarioService.deleteUsuario(id);
	}
}
