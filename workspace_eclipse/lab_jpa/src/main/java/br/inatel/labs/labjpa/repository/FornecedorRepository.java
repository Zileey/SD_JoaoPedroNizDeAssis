package br.inatel.labs.labjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.inatel.labs.labjpa.entity.Fornecedor;
import br.inatel.labs.labjpa.entity.Produto;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{
	
}
