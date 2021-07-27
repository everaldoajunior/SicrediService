package br.com.sicredi.system.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sicredi.system.model.Votacao;
import br.com.sicredi.system.model.Voto;
import br.com.sicredi.system.repository.VotoRepository;

@Service
public class VotoService {

	@Autowired
	private VotoRepository votoRepository;
	
	@Autowired
	private VotacaoService votacaoService;
	
	public Voto newVoto(Voto voto) {
		return votoRepository.save(voto);
	}
	
	public Iterable<Voto> getVotos() {
		return votoRepository.findAll();
	}
	
	public Optional<Voto> getVoto(String id) {
		return votoRepository.findById(id);
	}
	
	public Voto updateVoto(Voto voto) {
		return votoRepository.save(voto);
	}
	
	public void deleteVoto(String id) {
		votoRepository.deleteById(id);
	}
	
	public Voto newVotacaoVoto(String id, Voto voto) {
		Votacao votacao = this.votacaoService.getVotacao(id).get();
		this.newVoto(voto);
		votacao.getVotos().add(voto);
		this.votacaoService.updateVotacao(votacao);
		return voto;
	}
}
