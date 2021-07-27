package br.com.sicredi.system.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.sicredi.system.model.Votacao;

public interface VotacaoRepository extends CrudRepository<Votacao, String> {

}
