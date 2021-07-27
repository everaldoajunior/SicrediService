package br.com.sicredi.system.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sicredi.system.model.Opcao;
import br.com.sicredi.system.repository.OpcaoRepository;

@Service
public class OpcaoService {

	@Autowired
	private OpcaoRepository votoOpcaoRepository;
	
	public Opcao newOpcao(Opcao voto) {
		return votoOpcaoRepository.save(voto);
	}
	
	public Iterable<Opcao> getOpcoes() {
		return votoOpcaoRepository.findAll();
	}
	
	public Optional<Opcao> getOpcao(String id) {
		return votoOpcaoRepository.findById(id);
	}
	
	public Opcao updateOpcao(Opcao opcao) {
		return votoOpcaoRepository.save(opcao);
	}
	
	public void deleteOpcao(String id) {
		votoOpcaoRepository.deleteById(id);
	}
}
