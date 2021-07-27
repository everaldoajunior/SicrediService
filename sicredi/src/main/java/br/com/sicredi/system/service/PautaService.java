package br.com.sicredi.system.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sicredi.system.model.Pauta;
import br.com.sicredi.system.repository.PautaRepository;

@Service
public class PautaService {

	@Autowired
	private PautaRepository pautaRepository;
	
	public Pauta newPauta(Pauta pauta) {
		return pautaRepository.save(pauta);
	}
	
	public Iterable<Pauta> getPautas() {
		return pautaRepository.findAll();
	}
	
	public Optional<Pauta> getPauta(String id) {
		return pautaRepository.findById(id);
	}
	
	public Pauta updatePauta(Pauta pauta) {
		return pautaRepository.save(pauta);
	}
	
	public void deletePauta(String id) {
		pautaRepository.deleteById(id);
	}
	
}
