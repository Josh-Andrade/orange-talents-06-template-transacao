package br.com.zup.ot6.transacao.transacaocartao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends CrudRepository<Transacao, Long>{

	@Query(value = "SELECT * FROM transacao WHERE numero_cartao = ?1 ORDER BY efetivada_em ASC LIMIT 10", nativeQuery = true)
	List<Transacao> findUltimasTransacoes(String numeroCartao);

	Optional<Transacao> findFirst1ByCartao_NumeroCartao(String numeroCartao);

}
