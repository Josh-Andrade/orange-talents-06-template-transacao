package br.com.zup.ot6.transacao.transacaocartao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoRequest {

	private String id;
	private BigDecimal valor;
	private EstabelecimentoRequest estabelecimento;
	private CartaoRequest cartao;
	private LocalDateTime efetivadaEm;

	@Deprecated
	public TransacaoRequest() {
	}
	
	public TransacaoRequest(String id, BigDecimal valor, EstabelecimentoRequest estabelecimento, CartaoRequest cartao,
			LocalDateTime efetivadaEm) {
		this.id = id;
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.cartao = cartao;
		this.efetivadaEm = efetivadaEm;
	}

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public EstabelecimentoRequest getEstabelecimento() {
		return estabelecimento;
	}

	public CartaoRequest getCartao() {
		return cartao;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}
	
	public Transacao toEntity() {
		return new Transacao(this);
	}

}
