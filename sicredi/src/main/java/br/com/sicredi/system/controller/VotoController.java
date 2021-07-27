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

import br.com.sicredi.system.model.Voto;
import br.com.sicredi.system.service.VotoService;

@RestController
@RequestMapping(path = "/votos")
public class VotoController {

	@Autowired
	private VotoService votoService;
	
	@PostMapping
	public Voto newVoto(@RequestBody Voto voto) {
		return votoService.newVoto(voto);
	}
	
	@GetMapping
	public Iterable<Voto> getVotos() {
		return votoService.getVotos();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Voto> getVoto(@PathVariable String id) {
		return votoService.getVoto(id);
	}
	
	@PutMapping
	public Voto updateVoto(@RequestBody Voto voto) {
		return votoService.updateVoto(voto);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteVoto(String id) {
		votoService.deleteVoto(id);
	}
	
	@PostMapping(path = "/{id}")
	public Voto newVotacaoVoto(@PathVariable String id, @RequestBody Voto voto) {
		return votoService.newVotacaoVoto(id, voto);
	}
}
