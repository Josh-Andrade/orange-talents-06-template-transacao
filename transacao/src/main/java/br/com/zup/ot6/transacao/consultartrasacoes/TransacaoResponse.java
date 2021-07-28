package br.com.zup.ot6.transacao.consultartrasacoes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {

	private BigDecimal valor;
	private EstabelecimentoResponse toResponse;
	private LocalDateTime efetivadaEm;

	@Deprecated
	public TransacaoResponse() {
	}

	public TransacaoResponse(BigDecimal valor, EstabelecimentoResponse toResponse, LocalDateTime efetivadaEm) {
		this.valor = valor;
		this.toResponse = toResponse;
		this.efetivadaEm = efetivadaEm;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public EstabelecimentoResponse getToResponse() {
		return toResponse;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}

}
