package br.inatel.labs.labjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.inatel.labs.labjpa.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	
	
}
