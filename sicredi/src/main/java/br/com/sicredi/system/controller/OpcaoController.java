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

import br.com.sicredi.system.model.Opcao;
import br.com.sicredi.system.service.OpcaoService;

@RestController
@RequestMapping(path = "/opcoes")
public class OpcaoController {

	@Autowired
	private OpcaoService opcaoService;

	
	@PostMapping
	public Opcao newOpcao(@RequestBody Opcao opcao) {
		return opcaoService.newOpcao(opcao);
	}
	
	@GetMapping
	public Iterable<Opcao> getOpcoes() {
		return opcaoService.getOpcoes();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Opcao> getOpcao(@PathVariable String id) {
		return opcaoService.getOpcao(id);
	}
	
	@PutMapping
	public Opcao updateOpcao(@RequestBody Opcao opcao) {
		return opcaoService.updateOpcao(opcao);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteOpcao(String id) {
		opcaoService.deleteOpcao(id);
	}
}
