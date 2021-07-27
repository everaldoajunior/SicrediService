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

import br.com.sicredi.system.model.Pauta;
import br.com.sicredi.system.model.Votacao;
import br.com.sicredi.system.service.VotacaoService;

@RestController
@RequestMapping(path = "/votacoes")
public class VotacaoController {

	@Autowired
	private VotacaoService votacaoService;
	
	@PostMapping
	public Votacao newVotacao(@RequestBody Votacao votacao) {
		return votacaoService.newVotacao(votacao);
	}
	
	@GetMapping
	public Iterable<Votacao> getVotacoes() {
		return votacaoService.getVotacoes();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Votacao> getVotacao(@PathVariable String id) {
		return votacaoService.getVotacao(id);
	}
	
	@PutMapping
	public Votacao updateVotacao(@RequestBody Votacao votacao) {
		return votacaoService.updateVotacao(votacao);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteVotacao(String id) {
		votacaoService.deleteVotacao(id);
	}
	
	@PostMapping(path = "/{id}")
	public Pauta newPautaVotacao(@PathVariable String id, @RequestBody Votacao votacao) {
		return this.votacaoService.newPautaVotacao(id, votacao);
	}
}
