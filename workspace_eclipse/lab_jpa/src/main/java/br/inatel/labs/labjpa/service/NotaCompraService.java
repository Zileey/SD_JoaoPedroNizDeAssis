package br.inatel.labs.labjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.inatel.labs.labjpa.entity.Fornecedor;
import br.inatel.labs.labjpa.entity.NotaCompra;
import br.inatel.labs.labjpa.entity.NotaCompraItem;
import br.inatel.labs.labjpa.repository.NotaCompraItemRepository;
import br.inatel.labs.labjpa.repository.NotaCompraRepository;
import br.inatel.labs.labjpa.repository.ProdutoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
@Transactional
public class NotaCompraService {

	@Autowired
	private NotaCompraRepository repository; 
	
	@Autowired
	private NotaCompraItemRepository ncirepository; 
	
	public NotaCompra salvarNotaCompra(NotaCompra f) {
		return repository.save(f);
	}
	
	public Optional<NotaCompra> buscarNotaCompraPeloId(Long id) {
		return repository.findById(id);
	}
	
	public NotaCompra buscarNotaCompraPeloIdComListaItem(Long id) {
		Optional<NotaCompra> f = repository.findById(id);
		if(f.isPresent()) {
			NotaCompra n = f.get();
			n.getListaNotaCompraItem().size();
			return n;
		}else {
			throw new RuntimeException("Nenhuma nota compra encontrada");
		}
	}
	
	public List<NotaCompra> listarNotaCompra(){
		return repository.findAll();
	}
	

	public NotaCompraItem salvarNotaCompraItem(NotaCompraItem f) {
		return ncirepository.save(f);
	}
	
	public Optional<NotaCompraItem> buscarNotaCompraItemPeloId(Long id) {
		return ncirepository.findById(id);
	}
	
	public List<NotaCompraItem> listarNotaCompraItem(){
		return ncirepository.findAll();
	}
	
}
