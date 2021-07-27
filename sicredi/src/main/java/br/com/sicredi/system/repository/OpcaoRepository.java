package br.com.sicredi.system.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.sicredi.system.model.Opcao;

public interface OpcaoRepository extends CrudRepository<Opcao, String>{

	public Optional<Opcao> findByNome(String nome);
}
