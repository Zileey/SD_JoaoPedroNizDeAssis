package br.inatel.labs.labjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.inatel.labs.labjpa.repository.RelatorioRepository;
import dto.TotalCompradoPorFornecedor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class RelatorioService {
	
	@Autowired
	private RelatorioRepository repository;
	
	public List<TotalCompradoPorFornecedor> pesquisarTotalCompradoPorFornecedor() {
	    return repository.pesquisarTotalCompradoPorFornecedor();
	}
}
