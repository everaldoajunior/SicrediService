package br.com.sicredi.system.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.sicredi.system.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

}
