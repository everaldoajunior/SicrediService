package br.com.sicredi.system.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sicredi.system.model.Usuario;
import br.com.sicredi.system.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario newUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Iterable<Usuario> getUsuarios() {
		return usuarioRepository.findAll();
	}
	
	public Optional<Usuario> getUsuario(String id) {
		return usuarioRepository.findById(id);
	}
	
	public Usuario updateUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public void deleteUsuario(String id) {
		usuarioRepository.deleteById(id);
	}
}
