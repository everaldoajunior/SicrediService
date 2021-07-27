package br.com.sicredi.system.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sicredi.system.model.Pauta;
import br.com.sicredi.system.model.Votacao;
import br.com.sicredi.system.repository.VotacaoRepository;

@Service
public class VotacaoService {

	@Autowired
	private VotacaoRepository votacaoRepository;
	
	@Autowired
	private PautaService pautaService;
	
	public Votacao newVotacao(Votacao votacao) {
		return votacaoRepository.save(votacao);
	}
	
	public Iterable<Votacao> getVotacoes() {
		return votacaoRepository.findAll();
	}
	
	public Optional<Votacao> getVotacao(String id) {
		return votacaoRepository.findById(id);
	}
	
	public Votacao updateVotacao(Votacao votacao) {
		return votacaoRepository.save(votacao);
	}
	
	public void deleteVotacao(String id) {
		votacaoRepository.deleteById(id);
	}
	
	public Pauta newPautaVotacao(String id, Votacao votacao) {
		Pauta pauta = pautaService.getPauta(id).get();
		pauta.setVotacao(votacao);
		this.newVotacao(votacao);
		pautaService.updatePauta(pauta);
		return pauta;
	}
}
