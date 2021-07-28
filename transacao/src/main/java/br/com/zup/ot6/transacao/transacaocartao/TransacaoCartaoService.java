package br.com.zup.ot6.transacao.transacaocartao;

import javax.transaction.Transactional;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransacaoCartaoService {

	private TransacaoRepository transacaoRepository;

	public TransacaoCartaoService(TransacaoRepository transacaoRepository) {
		this.transacaoRepository = transacaoRepository;
	}

	@KafkaListener(topics = "transacoes")
	@Transactional
	public void salvandoTransacoes(TransacaoRequest transacao) {
		transacaoRepository.save(transacao.toEntity());
	}
}
