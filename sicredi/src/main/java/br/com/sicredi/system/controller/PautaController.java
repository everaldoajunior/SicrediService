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
import br.com.sicredi.system.service.PautaService;

@RestController
@RequestMapping(path = "/pautas")
public class PautaController {

	@Autowired
	private PautaService pautaService;
	
	@PostMapping
	public Pauta newPauta(@RequestBody Pauta pauta) {
		return pautaService.newPauta(pauta);
	}
	
	@GetMapping
	public Iterable<Pauta> getPautas() {
		return pautaService.getPautas();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Pauta> getPauta(@PathVariable String id) {
		return pautaService.getPauta(id);
	}
	
	@PutMapping
	public Pauta updatePauta(@RequestBody Pauta pauta) {
		return pautaService.updatePauta(pauta);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deletePauta(String id) {
		pautaService.deletePauta(id);
	}
}
