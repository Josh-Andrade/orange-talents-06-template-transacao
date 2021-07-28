package br.com.zup.ot6.transacao.consultartrasacoes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.zup.ot6.transacao.transacaocartao.Transacao;
import br.com.zup.ot6.transacao.transacaocartao.TransacaoRepository;

@RestController
@RequestMapping("/api")
public class ConsultarTransacoesController {

	private TransacaoRepository transacaoRepository;

	public ConsultarTransacoesController(TransacaoRepository transacaoRepository) {
		this.transacaoRepository = transacaoRepository;
	}
	
	@GetMapping("/transacao/consultar/{numeroCartao}")
	public ResponseEntity<List<TransacaoResponse>> retornarDezUltimasTransacoes(@PathVariable("numeroCartao") String numeroCartao){
		verificarNumeroCartao(numeroCartao);
		List<Transacao> ultimasTransacoes = transacaoRepository.findUltimasTransacoes(numeroCartao);
		
		return ResponseEntity.ok(ultimasTransacoes.stream().map(t -> t.toResponse()).collect(Collectors.toList()));
	}

	private void verificarNumeroCartao(String numeroCartao) {
		if(transacaoRepository.findFirst1ByCartao_NumeroCartao(numeroCartao).isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cartão não encontrado");
		}
	}
}
